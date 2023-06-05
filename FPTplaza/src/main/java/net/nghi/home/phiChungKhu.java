package net.nghi.home;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class phiChungKhu {
	@Id
	private String matt;
	private String maCanHo;
	private Float dienTich;
	private String maToaNha;
	private String hoTenChuHo;
	private String soDienThoai;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate thangBD;
	private Integer soThang;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayDong;
	private Float tongTien;

	public phiChungKhu(DTOPhiChungCu dtoPhiChungCu) {
		this.matt = dtoPhiChungCu.getMatt();
		this.maCanHo = dtoPhiChungCu.getMaCanHo();
		this.dienTich = dtoPhiChungCu.getDienTich();
		this.maToaNha = dtoPhiChungCu.getMaToaNha();
		this.hoTenChuHo = dtoPhiChungCu.getHoTenChuHo();
		this.soDienThoai = dtoPhiChungCu.getSoDienThoai();
		this.thangBD = dtoPhiChungCu.getThangBD();
		this.soThang = dtoPhiChungCu.getSoThang();
		this.ngayDong = dtoPhiChungCu.getNgayDong();
		this.tongTien = dtoPhiChungCu.getTongTien();

	}

	public phiChungKhu(String matt, String maCanHo, Float dienTich, String maToaNha, String hoTenChuHo,
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

	public phiChungKhu() {
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
