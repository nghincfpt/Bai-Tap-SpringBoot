package net.nghi.home;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class toaNha {
@Id
	private String maToaNha;
	private String  tenToaNha;
	public toaNha(String maToaNha, String tenToaNha) {
		super();
		this.maToaNha = maToaNha;
		this.tenToaNha = tenToaNha;
	}
	public toaNha() {
		super();
	}
	public String getMaToaNha() {
		return maToaNha;
	}
	public void setMaToaNha(String maToaNha) {
		this.maToaNha = maToaNha;
	}
	public String getTenToaNha() {
		return tenToaNha;
	}
	public void setTenToaNha(String tenToaNha) {
		this.tenToaNha = tenToaNha;
	}
	
	
}
