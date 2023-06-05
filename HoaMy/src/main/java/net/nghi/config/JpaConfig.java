package net.nghi.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
// kết nối sqlserver

@Configuration
@EnableJpaRepositories(basePackages = {"net.nghi"})
@EnableTransactionManagement
public class JpaConfig {
	 	@Bean
	    public LocalEntityManagerFactoryBean entityManagerFactory() {
	        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	        factoryBean.setPersistenceUnitName("Staff");	          
	        return factoryBean;
	    }
	     
	    @Bean
	    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory);
	          
	        return transactionManager;
	    } 
}
