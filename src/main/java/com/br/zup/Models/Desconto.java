package com.br.zup.Models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Desconto {

	@NotNull
	private double minimumValue;
	
	@NotNull
	private double maximumValue;

	public enum tipoDesconto {
		
		FLAT(),PERCENTUAL(),BRINDE();
	}
	
	public Desconto() {
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
