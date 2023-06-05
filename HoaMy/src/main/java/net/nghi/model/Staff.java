package net.nghi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Staff {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySuDung;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="staffID" )
	private Long staffID;

	@Column(name = "name" ,columnDefinition = "nvarchar(50)")
	private String  name;
	

	@Column(name = "birthDay")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDay;
	
	@Column(name = "email" ,columnDefinition = "nvarchar(50)")
	private String email;
	
	@Column(name = "phone" ,columnDefinition = "nvarchar(50)")
	private String phone;
	
	@Column(name = "gender" ,columnDefinition = "nvarchar(50)")
	private String gender;
	
	@Column(name = "avata" ,columnDefinition = "nvarchar(50)")
	private String avata;
	
	@Column(name = "dateStart")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateStart;
	
	@Column(name = "endDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	
	@Column(name = "branch" ,columnDefinition = "nvarchar(50)")
	private String branch;

	@Column(name = "tongTien" ,columnDefinition = "float")
	private Float tongTien;

	
	
}