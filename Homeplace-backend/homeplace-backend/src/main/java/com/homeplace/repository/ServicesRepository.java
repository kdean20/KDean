package com.homeplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeplace.entity.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services,Integer>{

}
