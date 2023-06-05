package net.nghi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Users {

	@Id
	@Column(name ="userID" ,columnDefinition = "nvarchar(50)" )
	private String userID;
	@Column(name = "accountID",columnDefinition = "nvarchar(50)")
	private String accountID;
	@Column(name = "fullName" ,columnDefinition = "nvarchar(50)")
	private String  fullName;
	@Column(name = "email" ,columnDefinition = "nvarchar(50)")
	private String email;
	@Column(name = "phone" ,columnDefinition = "nvarchar(50)")
	private String phone;
	@Column(name = "address" ,columnDefinition = "nvarchar(50)")
	private String address;
	@Column(name = "gender" ,columnDefinition = "nvarchar(50)")
	private String gender;
	@Column(name = "avata" ,columnDefinition = "nvarchar(50)")
	private String avata;
	@Column(name = "dateOfBirth",columnDefinition = "nvarchar(50)")
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") 
	private String dateOfBirth;
	@Column(name = "status" ,columnDefinition = "nvarchar(50)")
	private String status;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAvata() {
		return avata;
	}
	public void setAvata(String avata) {
		this.avata = avata;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Users(String userID, String accountID, String fullName, String email, String phone, String address,
			String gender, String avata, String dateOfBirth, String status) {
		super();
		this.userID = userID;
		this.accountID = accountID;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.avata = avata;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
	}
	public Users() {
		super();
	}
}
