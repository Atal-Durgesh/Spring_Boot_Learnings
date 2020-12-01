package com.hospital.rater.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.rater.model.Hospital;

public interface HospitalRepository  extends CrudRepository<Hospital,Integer>{

}
