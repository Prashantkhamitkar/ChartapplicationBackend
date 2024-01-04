package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ChartDao;
import com.example.pojo.Chartdata;

@Service
public class ChartServiceImpl implements ChartServiceInterface {
	@Autowired
	private ChartDao repo;
	
	@Override
	public List<Chartdata> getAllchartdetails() {
		// TODO Auto-generated method stub
		List<Chartdata> list=repo.findAll();
		if(list!=null)
		return list;
		return null;
	}

}
