package com.hospital.rater.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.rater.message.HospitalMessage;
import com.hospital.rater.model.Hospital;
import com.hospital.rater.service.HospitalService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping(value="/getAllHospitals")
	public List<Hospital> getAllHospitals(){
		return hospitalService.getAllHospitals();
	}
	
	    @CrossOrigin
		@ApiOperation("API to save a new product")
		@RequestMapping(value="/saveProduct",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
 public ResponseEntity<HospitalMessage> createHospital(@RequestBody Hospital dto){
	    	
		int hospitalId = hospitalService.saveHospital(dto);
		HashMap<String,Object> params = new HashMap<>();
		params.put("HospitalId", hospitalId);
		String message = "Hospital Saved Successfully";
		HospitalMessage hosp = new HospitalMessage(params);
		hosp.setMessage(message);
		return new ResponseEntity<>(hosp,HttpStatus.OK);

	}

}
