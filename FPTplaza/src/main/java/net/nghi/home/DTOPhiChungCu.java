package net.nghi.home;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
//@Pattern(regexp = "^(090|091|\\+84)\\d{7}$", message = "Số điện thoại chưa đúng")
public class DTOPhiChungCu {
	
	@NotBlank(message = "matt can't br empty")
	private String matt;
	@NotBlank(message = "maCanHo can't br empty")
	private String maCanHo;
	@NotNull(message = "dienTich can't br empty")
	private Float dienTich;
	@NotBlank(message = "maToaNha can't br empty")
	private String maToaNha;
	@NotBlank(message = "hoTenChuHo can't br empty")
	private String hoTenChuHo;
	@NotBlank(message = "soDienThoai can't br empty")
	@Pattern(regexp ="^0\\d{9}$",message = "SDT  khong dung dinh dang")
	private String soDienThoai;
	//@NotBlank(message = "Status can't br empty")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate  thangBD;
	@NotNull(message = "Status can't br empty")
	@Min(value = 0,message = " khong duoc nhap so nho hon 0")
	@Max(value = 12,message = "khong duoc nhap so lon hon 12 ")
	private Integer soThang;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayDong;
	private Float  tongTien;
	public DTOPhiChungCu(String matt, String maCanHo, Float dienTich, String maToaNha, String hoTenChuHo,
			String soDienThoai, LocalDate thangBD, Integer soThang, LocalDate ngayDong, Float tongTien) {
		super();
		this.matt = matt;
		this.maCanHo = maCanHo;
		this.dienTich = dienTich;
		this.maToaNha = maToaNha;
		this.hoTenChuHo = hoTenChuHo;
		this.soDienThoai = soDienThoai;
		this.thangBD = thangBD;
		this.soThang = soThang;
		this.ngayDong = ngayDong;
		this.tongTien = tongTien;
	}
	public DTOPhiChungCu() {
		super();
	}
	public String getMatt() {
		return matt;
	}
	public void setMatt(String matt) {
		this.matt = matt;
	}
	public String getMaCanHo() {
		return maCanHo;
	}
	public void setMaCanHo(String maCanHo) {
		this.maCanHo = maCanHo;
	}
	public Float getDienTich() {
		return dienTich;
	}
	public void setDienTich(Float dienTich) {
		this.dienTich = dienTich;
	}
	public String getMaToaNha() {
		return maToaNha;
	}
	public void setMaToaNha(String maToaNha) {
		this.maToaNha = maToaNha;
	}
	public String getHoTenChuHo() {
		return hoTenChuHo;
	}
	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public LocalDate getThangBD() {
		return thangBD;
	}
	public void setThangBD(LocalDate thangBD) {
		this.thangBD = thangBD;
	}
	public Integer getSoThang() {
		return soThang;
	}
	public void setSoThang(Integer soThang) {
		this.soThang = soThang;
	}
	public LocalDate getNgayDong() {
		return ngayDong;
	}
	public void setNgayDong(LocalDate ngayDong) {
		this.ngayDong = ngayDong;
	}
	public Float getTongTien() {
		return tongTien;
	}
	public void setTongTien(Float tongTien) {
		this.tongTien = tongTien;
	}
	
	
}
