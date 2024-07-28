package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Result;
import com.student.repository.ResultRepo;

@RestController
@RequestMapping("/result")
public class ResultController {
	
	

	
	@Autowired
	private ResultRepo repo;
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Result model) {
		
		Result save = repo.save(model);
		
		return save;
	}
	
	@GetMapping("/result/{hallticketno}")
	public Result hallticket(@PathVariable String hallticketno) {
		
		 return repo.findById(hallticketno).get();
	}
}
