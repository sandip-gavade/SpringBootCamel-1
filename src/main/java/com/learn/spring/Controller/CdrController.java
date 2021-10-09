package com.learn.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.entity.cdrEntity;
import com.learn.spring.respository.cdrRepository;

@RestController
@RequestMapping("/api/v1/")
public class CdrController {
	
	@Autowired
	cdrRepository cdrRepository;
	
	@GetMapping("/allCDR")
	public List<cdrEntity> getAllEmployees(){
		return cdrRepository.findAll();
	}		
	

}
