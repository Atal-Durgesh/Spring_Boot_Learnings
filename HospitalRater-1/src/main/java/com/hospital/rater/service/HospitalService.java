package com.hospital.rater.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Comparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.rater.model.Hospital;
import com.hospital.rater.repository.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalRepo;
	
	

	public List<Hospital> getAllHospitals() {
		
		List<Hospital> hospitalList = new ArrayList<Hospital>();
		 hospitalRepo.findAll().forEach(hospitalList::add);
		 Comparator<Hospital> compare = Comparator.comparing(Hospital::getRating);
		 Collections.sort(hospitalList, compare);
		 return hospitalList;
	}
	
	public int saveHospital(Hospital dto) {
		Hospital h = hospitalRepo.save(dto);
		return h.getId();
	}

}
