package net.nghi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.nghi.exception.UserNotfoundException;
import net.nghi.model.Users;
import net.nghi.repository.UserRepostory;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepostory userRepostory;
	
	
	@PostMapping("/user")
	Users newUser(@RequestBody Users newUsers) {
		return userRepostory.save(newUsers);
	}
	
	@GetMapping("/users")
	List<Users> listAllUser(){
		return userRepostory.findAll();
	}
	
	@GetMapping("/user/{id}")
	Users getUserByID(@PathVariable String id) {
		return userRepostory.findById(id)
				.orElseThrow(()->new UserNotfoundException(id));
	}
	
	@PutMapping("/user/{id}")
	Users updateUser(@RequestBody Users newUser,@PathVariable String id) {
		return userRepostory.findById(id)
				.map(user ->{
					user.setUserID(newUser.getUserID());
					user.setAccountID(newUser.getAccountID());
					user.setFullName(newUser.getFullName());
					user.setEmail(newUser.getEmail());
					user.setPhone(newUser.getPhone());
					user.setDateOfBirth(newUser.getDateOfBirth());
					user.setGender(newUser.getGender());
					user.setStatus(newUser.getStatus());
					user.setAddress(newUser.getAddress());
					user.setAvata(newUser.getAvata());
					
					return userRepostory.save(user);
				}).orElseThrow(()->new  UserNotfoundException(id));
	}
	@DeleteMapping("/user/{id}")
	String deleteID(@PathVariable String id) {
		if(!userRepostory.existsById(id)) {
			throw new UserNotfoundException(id);	
		}else {
			 userRepostory.deleteById(id);
			 return "User wwith id " + id +" has been deleted success";
		}
	}
}
