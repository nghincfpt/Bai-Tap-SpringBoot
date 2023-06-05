package net.nghi.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.nghi.home.toaNha;

@Service
public class toaNhaService {

	
	@Autowired
	private toaNhaRepository repository;
	
	 public List<toaNha> listAll() {
	        return (List<toaNha>) repository.findAll();
	    }
}
