package net.nghi.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;
import net.nghi.home.phiChungKhu;



@Service
public class phiChungKhuService {

	@Autowired
	private phiChungKhuRepository repository;
	
	 public void save(phiChungKhu chungKhu) {
		 repository.save(chungKhu);
	    }
	     
	    public List<phiChungKhu> listAll() {
	        return (List<phiChungKhu>) repository.findAll();
	    }
	     
	    public phiChungKhu get(String id) {
	        return repository.findById(id).get();
	    }
	     
	    public void delete(String matt) {
	    	repository.deleteById(matt);
	    }
	    public List<phiChungKhu> searchSelect(String keyword) {
			return repository.searchSelect(keyword);
		}
	    public List<phiChungKhu> searchInName(String keyword){
	    	return repository.searchInName(keyword);
	    }   
	     
	   public int soThang(String matt) {
		  return repository.findSoThang(matt);
	  }
	   
	   public List<phiChungKhu> findAll(Sort sort){
		   return (List<phiChungKhu>) repository.findAll(sort);
		
	}
}
