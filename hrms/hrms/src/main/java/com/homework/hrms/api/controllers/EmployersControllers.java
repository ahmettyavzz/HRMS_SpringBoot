package com.homework.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.hrms.business.abstracts.EmployerService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.entities.concretes.Employer;


@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {

	
		private EmployerService employerService;

		@Autowired
		public EmployersControllers(EmployerService employerService) {
			super();
			this.employerService = employerService;
		}
		
		
		@GetMapping("/getall")
		public DataResult<List<Employer>> getAll(){
			return this.employerService.getall();  
		}
		
		@PostMapping("/add")
		public Result add(Employer employer) {
			return this.employerService.add(employer);
		}
		
		
}
