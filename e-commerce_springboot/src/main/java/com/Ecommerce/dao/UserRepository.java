package com.Ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Ecommerce.entities.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {

	public AppUser findByUsername(String username);
	public AppUser findByEmail(String email);
	//public AppUser findByPanierId(@Param("id") Long id);
	
}
