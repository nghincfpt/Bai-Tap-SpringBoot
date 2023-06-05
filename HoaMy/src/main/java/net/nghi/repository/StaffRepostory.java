package net.nghi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.nghi.model.Limit;
import net.nghi.model.Staff;
import net.nghi.model.StaffIntefece;
import net.nghi.model.Total;

@Repository
public interface StaffRepostory  extends JpaRepository<Staff,Long>{

	@Query(value="select count(*) as quantity, month(birthDay) "
			+ "as month from Staff group by month(birthDay) order by month asc" ,nativeQuery = true)
	List<StaffIntefece> getAll();
	
	
	@Query(value = "SELECT SUM(total) AS tongTien FROM invoice ",nativeQuery =true)
	List<Total> getTotal();
	
	@Query(value = "select top 5  name,branch,tongTien from Staff order by  tongTien desc" ,nativeQuery = true)
	List<Limit>getLimit();
}
