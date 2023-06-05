package net.nghi.customer;

import javax.validation.constraints.NotBlank;

public class DTOCustomer {
	
	private Long id;
	
	@NotBlank(message = "UserName can't br empty")
	private String name;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String address;
	
	public DTOCustomer(Long id,String name, String email,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public DTOCustomer() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
