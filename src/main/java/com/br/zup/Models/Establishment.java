package com.br.zup.Models;
import org.springframework.http.ResponseEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name="establishment")

public class Establishment  implements Serializable{
	private final static long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEstablishment")
	private Integer id;
	
//	@OneToMany(mappedBy = "campaign")
//	private Campaign campaign;
	
	@NotBlank(message = "Name of the establishment field must be completed")
	@Column(name="NameOfTheEstablishment")
	private String nameOfTheEstablishment;

	@NotBlank(message = "Phone field needs to be completed")
	@Column(name="telephone")
	private String telephone;

	@Min(value = 14, message = "CNPJ must be at least 14 digits")
	@Column(name="cnpj")
	@NotBlank(message = "CNPJ field needs to be filled")
	@NotNull(message="cnpj cannot be null!")
	private String cnpj;
	
	@NotNull(message="Owner name cannot be null!")
	@Column(name="OwnerName")
	@NotBlank(message = "Owner Name field must be completed")
	private String ownerName;

	@NotBlank(message = "Address field must be completed")
	@Column(name="address")
	private String address;

	@NotBlank(message = "City field needs to be completed")
	@Column(name="city")
	private String city;

	@Min(value = 2,message = "State must be at least 2 characters")
	@Column(name="state")
	@NotBlank(message = "State field must be completed")
	private String state;

	@NotBlank(message = "Country field must be completed")
	@Column(name="country")
	private String country;

	public Establishment() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nameOfTheEstablishment;
	}

	public void setName(String name) {
		this.nameOfTheEstablishment = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
