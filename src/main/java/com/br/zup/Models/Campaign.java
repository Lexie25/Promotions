package com.br.zup.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Campaign implements Serializable{
	private final static long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message ="")
	private String campaignName;
	
	@NotBlank(message ="")
	private String establishmentCode;
	
	@NotBlank(message ="")
	private String mechanics;
	
	@NotBlank(message ="")
	private double minimumValue;
	
	@NotBlank(message ="")
	private double maximumValue;
	
	@NotBlank(message ="")
	private String startDate;
	
	@NotBlank(message ="")
	private String description;
	
	@NotBlank(message ="")
	private String endDate;

	

}
