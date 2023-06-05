package net.nghi.home;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.nghi.home.service.phiChungKhuService;
import net.nghi.home.service.toaNhaService;

@Controller
public class homeController {

	@Autowired
	private phiChungKhuService service;

	@Autowired
	private toaNhaService toaNhaService;

	@ModelAttribute("listmatoanha")
	public List<toaNha> allList() {
		return toaNhaService.listAll();
	}

//	@RequestMapping("/")
//	public ModelAndView homeView() {
//		ModelAndView maHome = new ModelAndView("indeHome");
//		List<phiChungKhu> list = service.listAll();
//		maHome.addObject("lists", list);
//		return maHome;
//	}

	@RequestMapping("/newphichungcu")
	public String newphiduchvu(Map<String, Object> model) {
		model.put("phichungcu", new phiChungKhu());
		return "newPhiChungKhu";
	}

	@PostMapping(value = "/savephichungcu")
	public String savephidichvu(Model model, @Validated @ModelAttribute("phichungcu") DTOPhiChungCu dtoPhiChungCu,
			BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "newPhiChungKhu";
		}
		
		
		float tongTien = 0;
		int money = 11000;
		float dienTich = dtoPhiChungCu.getDienTich();
		int soThang = dtoPhiChungCu.getSoThang();
	
		LocalDate ngaydong = dtoPhiChungCu.getNgayDong();
		LocalDate thangBD = dtoPhiChungCu.getThangBD();

		 Period period = Period.between(thangBD.withDayOfMonth(1), ngaydong.withDayOfMonth(1));
		 int monthsBetween = period.getMonths();

		 if(monthsBetween > 0 ) {
			 tongTien = dienTich*11000*soThang + 100000*monthsBetween;
		 }else if(soThang < 3 && monthsBetween <=0 ) {
			 tongTien = dienTich * money * soThang;
		 }else if(soThang > 3 && monthsBetween <=0) {
			 tongTien = (float) (dienTich * money * 3 + dienTich*money*(soThang-3)*0.9) ;
		 }
			
		 
		phiChungKhu chungKhu = new phiChungKhu(dtoPhiChungCu);
		chungKhu.setTongTien(tongTien);
		service.save(chungKhu);
		attributes.addFlashAttribute("message", "create success");
		return "redirect:/";
	}

	

	@RequestMapping("/editphichungcu")
	public ModelAndView editphichungcuAndView(Model model, @RequestParam String id) {
		ModelAndView maphi = new ModelAndView("editPhiChunCu");
		phiChungKhu phiChungKhu = service.get(id);

		maphi.addObject("phichungcu", phiChungKhu);
		return maphi;
	}
	
	
	@PostMapping(value = "/saveEdit")
	public String editsave(Model model, @Validated @ModelAttribute("phichungcu") DTOPhiChungCu dtoPhiChungCu,
			BindingResult result, RedirectAttributes attributes) {
			
		if (result.hasErrors()) {		
			return "editPhiChunCu";
		}
		
		int sothangTruoc = service.soThang(dtoPhiChungCu.getMatt());
		int soThangSau   = dtoPhiChungCu.getSoThang();
		
		if(soThangSau < sothangTruoc) {
			model.addAttribute("message","Error_19980705: So thang thay doi khong hop le. ");
			return "editPhiChunCu";
		}
		
	
		
		phiChungKhu chungKhu = new phiChungKhu(dtoPhiChungCu);

		service.save(chungKhu);
		attributes.addFlashAttribute("message", "Update thong tin dang ki thanh cong");
		return "redirect:/";
	}
	
	
	@RequestMapping("/deletematt")
	public String deleteFPTplaza(@RequestParam String matt) {
		service.delete(matt);
		return "redirect:/";
	}
	
	
	@RequestMapping("/searchInMa")
	public ModelAndView search(@RequestParam String keyword) {
		List<phiChungKhu> result = service.searchSelect(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);

		return mav;
	}
	
	@RequestMapping("/searchInName")
	public ModelAndView searchInName(@RequestParam String keyword) {
		List<phiChungKhu> inname = service.searchInName(keyword);
		ModelAndView search = new ModelAndView("search");
		search.addObject("result", inname);

		return search;
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public String error() {
		return "error";
	}
	
	//soft
	
	@RequestMapping("/")
	public ModelAndView home(@RequestParam("field") Optional<String> field) {
		ModelAndView computer = new ModelAndView("indeHome");
		Sort sort = Sort.by(Direction.ASC, field.orElse("hoTenChuHo"));
		List<phiChungKhu> listcomputer = service.findAll(sort);
		
		computer.addObject("lists", listcomputer);
		return computer;
	}

	
	
}