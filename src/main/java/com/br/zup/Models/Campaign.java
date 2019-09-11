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

	@NotBlank(message ="Campaign may not be blank")
	private String campaignName;

	@NotBlank(message ="Store code cannot be blank")
	private String establishmentCode;

	@NotBlank(message ="the mechanics can't be blank")
	private String mechanics;

	@NotBlank(message ="")
	private double minimumValue;

	@NotBlank(message ="")
	private double maximumValue;

	@NotBlank(message ="start date cannot be blank")
	private String startDate;

	@NotBlank(message ="description cannot be blank")
	private String description;

	@NotBlank(message ="campaign end date must not be blank")
	private String endDate;

	@NotBlank(message ="")
	private long numberOfCampaign;

	public Campaign(Integer id, @NotBlank(message = "") String campaignName,
			@NotBlank(message = "") String establishmentCode, @NotBlank(message = "") String mechanics,
			@NotBlank(message = "") double minimumValue, @NotBlank(message = "") double maximumValue,
			@NotBlank(message = "") String startDate, @NotBlank(message = "") String description,
			@NotBlank(message = "") String endDate, @NotBlank(message = "") long numberOfCampaign) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.establishmentCode = establishmentCode;
		this.mechanics = mechanics;
		this.minimumValue = minimumValue;
		this.maximumValue = maximumValue;
		this.startDate = startDate;
		this.description = description;
		this.endDate = endDate;
		this.numberOfCampaign = numberOfCampaign;
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

	public long getNumberOfCampaign() {
		return numberOfCampaign;
	}

	public void setNumberOfCampaign(long numberOfCampaign) {
		this.numberOfCampaign = numberOfCampaign;
	}
}
