package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Chartdata;
import com.example.service.ChartServiceInterface;

@RestController
@RequestMapping("/chart")
@CrossOrigin("*")
public class ChartController {
	
	@Autowired
	private ChartServiceInterface chartrepo;
	
	@GetMapping("/data")
	public ResponseEntity<?> getDetails(){
		List<Chartdata> list=chartrepo.getAllchartdetails();
		if(list!=null)
		return ResponseEntity.ok(list);
		
		return ResponseEntity.ofNullable("Not found");
	}

}
