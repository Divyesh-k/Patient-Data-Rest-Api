package com.restapi1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi1.entity.patient_info;

public interface Patient_info_repo extends JpaRepository<patient_info, Integer>{
	
}
