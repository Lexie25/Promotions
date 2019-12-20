package com.br.zup.Models;

public class RegisterEstablishmentRequest {
	
	public UserAdmin user;
	public Establishment establishment;
	
	public RegisterEstablishmentRequest(UserAdmin user, Establishment establishment) {
		super();
		this.user = user;
		this.establishment = establishment;
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
	
	
}
