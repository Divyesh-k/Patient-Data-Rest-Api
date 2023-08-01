package com.restapi1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi1.entity.patient_info;
import com.restapi1.exception.PatientNotFoundException;
import com.restapi1.repo.Patient_info_repo;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*" , allowedHeaders = "*")
public class PatientDataController {

	@Autowired
	private Patient_info_repo repo;
	
	@GetMapping("/getPatients")
	public List<patient_info> getPatients() {
		return repo.findAll();
	}
	
	@GetMapping("/getPatient/{id}")
	public patient_info one(@PathVariable int id) {
		return repo.findById(id)
				.orElseThrow(() -> new PatientNotFoundException(id));
	}
	
	@PostMapping("/addPatients")
	public patient_info addPatients(@RequestBody patient_info obj) {
		return repo.save(obj);
	}
	
	@PutMapping("/updatePatient/{id}")
	public patient_info updatePatient(@RequestBody patient_info obj , @PathVariable int id) {
		return repo.findById(id)
				.map(patient_info -> {
								 patient_info.setEntrydate(obj.getEntrydate());
								 patient_info.setHealthNumber(obj.getHealthNumber());
								 patient_info.setEmail(obj.getEmail());
								 patient_info.setFname(obj.getFname());
								 patient_info.setLname(obj.getLname());
								 patient_info.setSex(obj.getSex());
								 patient_info.setDate_of_birth(obj.getDate_of_birth());
								 patient_info.setPhone(obj.getPhone());
								 patient_info.setAddress(obj.getAddress());
								 patient_info.setMarital_status(obj.isMarital_status());
								 patient_info.setLess_18(obj.isLess_18());
								 return repo.save(patient_info);
				})
				.orElseGet(()->{
					obj.setId(id);
					return repo.save(obj);
				});
	}
	
	@DeleteMapping("/removePatient/{id}")
	public void deletePatient(@PathVariable int id) {
		repo.deleteById(id);
	}

}
