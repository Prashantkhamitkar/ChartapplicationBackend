package com.example.pojo;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Chart_Table")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Chartdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="intensity")
private Integer Intensity;	

	@Column(name="likelihood")
private Integer Likelihood;	
@Column(name="relevance")
private Integer Relevance;
@Column(name="end_year")
private Integer Endyear;
@Column(name="country")
private String Country;
@Column(name="topic")
private String Topics;
@Column(name="region")
private String Region;
@Column(name="city")
private String City;

@Column(name="citylng")
private Double citylng;
@Column(name="citylat")
private Double citylat;
@Column(name="sector")
private String Sector;
@Column(name="insight")
private String Insight;
@Column(name="swot")
private String Swot;
@Column(name="url")
private String Url;
@Column(name="start_year")
private Integer Startdata;
@Column(name="impact")
private Integer Impact;
@Column(name="added")
private String Added;
@Column(name="published")
private String Published;
@Column(name="pestle")
private String Pestle;
@Column(name="source")
private String Source;
@Column(name="title")
private String Title;

/* Intensity
-        Likelihood
-        Relevance
-        Year
-        Country
-        Topics
-        Region
-        City*/
	
}
