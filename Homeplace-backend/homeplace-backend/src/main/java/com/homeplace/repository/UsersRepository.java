package com.homeplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homeplace.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
	
	@Query("SELECT S from Users S WHERE S.email =?1 and S.password =?2")
	Users findUsersByEmailAndPassword(String email, String password);

}
