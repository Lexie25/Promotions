package com.br.zup.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity(name = "campaign")
public class Campaign implements Serializable{
	private final static long serialVersionUID = 1L;

	@Id
	@Column(name="idCampaign")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message ="Campaign may not be blank")
	@Column(name="CampaignName")
	private String campaignName;

//	@OneToOne(mappedBy = "establishment")
//    @JoinColumn(name="idEstablishment")
	@NotBlank(message ="Store code cannot be blank")
	private String establishmentCode;

	@NotBlank(message ="the mechanics can't be blank")
	@Column(name="mechanics")
	private String mechanics;

	@NotBlank(message ="")
    @Min(100)
	@Column(name="valorMinimo")
	private double minimumValue;

	@NotBlank(message ="")
	@Column(name="id")
	@Max(10000)
	private double maximumValue;

	@NotBlank(message ="start date cannot be blank")
	@Column(name="startDate")
	private String startDate;

	@NotBlank(message ="description cannot be blank")
	@Column(name="description")
	private String description;

	@NotBlank(message ="campaign end date must not be blank")
	@Column(name="endDate")
	private String endDate;
	
	@NotBlank
	@Column
	private double desconto;
	

//	@OneToOne(mappedBy = "campaign")
//	private Establishment establishment;

	public Campaign(Integer id, @NotBlank(message = "") String campaignName,
			@NotBlank(message = "") String establishmentCode, @NotBlank(message = "") String mechanics,
			@NotBlank(message = "") double minimumValue, @NotBlank(message = "") double maximumValue,
			@NotBlank(message = "") String startDate, @NotBlank(message = "") String description,
			@NotBlank(message = "") String endDate){
		this.id = id;
		this.campaignName = campaignName;
		this.establishmentCode = establishmentCode;
		this.mechanics = mechanics;
		this.minimumValue = minimumValue;
		this.maximumValue = maximumValue;
		this.startDate = startDate;
		this.description = description;
		this.endDate = endDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getEstablishmentCode() {
		return establishmentCode;
	}

	public void setEstablishmentCode(String establishmentCode) {
		this.establishmentCode = establishmentCode;
	}

	public String getMechanics() {
		return mechanics;
	}

	public void setMechanics(String mechanics) {
		this.mechanics = mechanics;
	}

	public double getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(double minimumValue) {
		this.minimumValue = minimumValue;
	}

	public double getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(double maximumValue) {
		this.maximumValue = maximumValue;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double desconto() {
		if(desconto == 100) {
			return desconto-10;
		}
		return desconto;
	}	
	
}