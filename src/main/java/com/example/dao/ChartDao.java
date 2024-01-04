package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Chartdata;

public interface ChartDao extends JpaRepository<Chartdata,Long>{

}
