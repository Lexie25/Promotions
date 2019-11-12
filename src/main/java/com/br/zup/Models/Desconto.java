 package com.br.zup.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="campaign")
public class Desconto implements Serializable{
	private final static long serialVersionUID = 1L; 

	@Id
	private Integer id;
	
	@NotNull
	private double minimumValue;
	
	@NotNull
	private double maximumValue;
	public Desconto() {
	}

	public enum tipoDesconto {
		
		FLAT,PERCENTUAL,BRINDE;
	}

    private String value;

    void Category(String v) {
        value = v;
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

}
