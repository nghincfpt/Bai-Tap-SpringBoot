package net.nghi.home.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import net.nghi.home.phiChungKhu;

//public interface phiChungKhuRepository  extends CrudRepository<phiChungKhu, String> {
public interface phiChungKhuRepository  extends PagingAndSortingRepository<phiChungKhu, String> {
	@Query(value = "SELECT c FROM phiChungKhu c WHERE c.hoTenChuHo LIKE '%' || :keyword || '%'")
	// + " OR c.email LIKE '%' || :keyword || '%'"
	// + " OR c.status LIKE '%' || :keyword || '%'")
	public List<phiChungKhu> searchInName(@Param("keyword") String keyword);
	
		
	@Query(value = "SELECT c FROM phiChungKhu c WHERE c.maToaNha = :keyword ")
	public List<phiChungKhu> searchSelect(@Param("keyword") String keyword);
	
	// lấy só tháng ra để so sánh
	@Query(value = "SELECT c.soThang FROM phiChungKhu c where c.matt = :matt ")
	public int findSoThang(@Param("matt") String matt);
	

	
//	@Query(value = "select * from phiChungKhu c order by id")
//	Page<phiChungKhu> findAll(@Param("sort") String sort);


}

