package net.nghi.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{
//seach
	 @Query(value = "SELECT c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%'"
	            + " OR c.email LIKE '%' || :keyword || '%'"
	            + " OR c.address LIKE '%' || :keyword || '%' ")
	    public Page<Customer> search(@Param("keyword") String keyword, Pageable pageable);
}
