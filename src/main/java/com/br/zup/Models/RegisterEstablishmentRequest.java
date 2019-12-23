package com.br.zup.Models;

public class RegisterEstablishmentRequest {
	
	public UserAdmin user;
	public Establishment establishment;
	public Campaign campaign;
	
	public RegisterEstablishmentRequest(UserAdmin user, Establishment establishment, Campaign campaign) {
		this.user = user;
		this.establishment = establishment;
		this.campaign = campaign;
	}

	public UserAdmin getUser() {
		return user;
	}

	public void setUser(UserAdmin user) {
		this.user = user;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
}
