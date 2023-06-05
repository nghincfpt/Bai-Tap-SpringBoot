package net.nghi.controller;
import java.util.List;

//package net.nghi.controller;
//
//import java.util.List;
//
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
import net.nghi.model.Limit;
import net.nghi.model.Staff;
import net.nghi.model.StaffIntefece;
import net.nghi.model.Total;
import net.nghi.repository.StaffRepostory;


@RestController
@CrossOrigin("http://localhost:3000")
public class StaffController {

	@Autowired
	private StaffRepostory staffRepostory;
	
	
//	@PostMapping("/staff")
//	Staff newUser(@RequestBody Staff newStaff) {
//		return staffRepostory.save(newStaff);
//	}
	
	@GetMapping("/staffs")
	List<StaffIntefece> listAllUser(){
		return staffRepostory.getAll();
	}
	
	@GetMapping("/totalStaff")
	List<Staff> listAll(){
		return staffRepostory.findAll();
	}
	
	@GetMapping("/total")
	List<Total> listAlltotal(){
		return staffRepostory.getTotal();
	}
	
	@GetMapping("/limmit")
	List<Limit> listAllLimit(){
		return staffRepostory.getLimit();
	}
}

	
//	@GetMapping("/staff/{id}")
//	Staff getUserByID(@PathVariable Long id) {
//		return staffRepostory.findById(id)
//				.orElseThrow(()->new UserNotfoundException(id));
//	}
//	
//	@PutMapping("/staff/{id}")
//	Staff updateUser(@RequestBody Staff newStaff,@PathVariable Long id) {
//		return staffRepostory.findById(id)
//				.map(staff ->{
//
//					staff.setStaffID(newStaff.getStaffID());
//					staff.setName(newStaff.getName());
//					staff.setBirthDay(newStaff.getBirthDay());
//					staff.setEmail(newStaff.getEmail());
//					staff.setPhone(newStaff.getPhone());
//					staff.setGender(newStaff.getGender());
//					staff.setAvata(newStaff.getAvata());
//					staff.setDateStart(newStaff.getDateStart());
//					staff.setEndDate(newStaff.getEndDate());
//					staff.setBranch(newStaff.getBranch());
//					
//					return staffRepostory.save(staff);
//				}).orElseThrow(()->new  UserNotfoundException(id));
//	}
//	@DeleteMapping("/staff/{id}")
//	String deleteID(@PathVariable Long id) {
//		if(!staffRepostory.existsById(id)) {
//			throw  new UserNotfoundException(id);	
//		}else {
//			 staffRepostory.deleteById(id);
//			 return "User wwith id " + id +" has been deleted success";
//		}
//	}
//}
