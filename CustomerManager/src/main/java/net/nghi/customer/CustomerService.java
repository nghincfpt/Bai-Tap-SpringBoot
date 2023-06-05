package net.nghi.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
private CustomerRepository repository;

	 public void save(Customer customer) {
		 repository.save(customer);
	    }
	     
	    public List<Customer> listAll() {
	        return (List<Customer>) repository.findAll();
	    }
	     
	    public Customer get(Long id) {
	        return repository.findById(id).get();
	    }
	     
	    public void delete(Long id) {
	    	repository.deleteById(id);
	    }
	    public Page<Customer> search(String keyword,Pageable pageable){
	        return repository.search(keyword,pageable);
	    }
	
}
