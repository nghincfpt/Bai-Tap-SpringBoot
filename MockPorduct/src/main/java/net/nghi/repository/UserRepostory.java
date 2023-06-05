/**
 * 
 */
package net.nghi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.nghi.model.Users;

/**
 * @author ASUS
 *
 */
public interface UserRepostory extends JpaRepository<Users,String>{

}
