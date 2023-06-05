package net.nghi.customer;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.BeanUtil;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
	  List<Customer> listCustomer= service.listAll();
		 mav.addObject("listCustomers",listCustomer);
		 return mav;
				
	}
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
 	    model.put("customer", new Customer());
	    return "new_customer";
	}
	
	@PostMapping(value = "/save" )
	public String saveCustomer(@Validated @ModelAttribute("customer")  DTOCustomer customerDto,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "new_customer"; 
		}
		Customer customer  = new Customer(customerDto);
		service.save(customer);
	    return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam long id) {
	    ModelAndView mav = new ModelAndView("edit_customer");
	    Customer customer = service.get(id);
	    mav.addObject("customer", customer);
	 
	    return mav;
}
	@RequestMapping("/delete")
	public String deleteCustomerForm(@RequestParam long id) {
		service.delete(id);
	    return "redirect:/";       
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword,
			@RequestParam(value ="page",defaultValue = "0")Integer page) {
	    Page<Customer> result = service.search(keyword,PageRequest.of((page * 2), 2) );
	    ModelAndView mav = new ModelAndView("index");
	    mav.addObject("result", result);
	    mav.addObject("keyword", keyword);
	    return mav;    
	}
}
