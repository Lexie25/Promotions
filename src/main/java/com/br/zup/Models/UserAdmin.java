package com.br.zup.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class UserAdmin {

	private final static long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;

	private boolean admin;
	
	private String name;
	public UserAdmin() {
		
	}

	public UserAdmin(Long id, @NotBlank String name, @Email String email, @NotBlank String password) {
		this.idUser = id;
		this.name = name;
	}

//
//		if (name.equals("admin") && password == password){
//			System.out.println("Está valido");
//		}else {
//			System.out.println ("");
//		}
//	}
//

	public Long getId() {
		return idUser;
	}

	public void setId(Long id) {
		this.idUser = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}