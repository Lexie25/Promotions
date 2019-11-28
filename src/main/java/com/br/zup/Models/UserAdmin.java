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
	private Integer id;

	private String name;

	private String passwords;

	public UserAdmin(Integer id, @NotBlank String name, @Email String email, @NotBlank String password) {
		this.id = id;
		this.name = name;
		this.passwords = password;


		if (name.equals("admin") && password == password){
			System.out.println("Está valido");
		}else {
			System.out.println ("");
		}
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswords() {
		return passwords ;
	}

	public void setPasswords(String password) {
		this.passwords = password;
	}
}