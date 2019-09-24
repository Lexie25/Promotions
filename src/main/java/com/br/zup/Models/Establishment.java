package com.br.zup.Models;
import org.hibernate.annotations.Cascade;
import org.springframework.http.ResponseEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="establishment")

public class Establishment  implements Serializable{
	private final static long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

//	@OneToMany(mappedBy = "establihsment")
//	@Cascade(org.hibernate.annotations.CascadeType.ALL)
//	private Campaign campaign;
//	
	@NotNull(message = "Name of the establishment field must be completed")
	@Column(name="nameOfTheEstablishment")
	private String nameOfTheEstablishment;

	@NotBlank(message = "Phone field needs to be completed")
	@Column(name="telephone")
	private String telephone;


	@Size(min = 14,max = 14, message = "CNPJ must be at least 14 digits")
	@Column(name="cnpj")
	@NotNull(message="cnpj cannot be null!")
	private String cnpj;

	@Size(min = 11,max = 11, message = "CPF must be at least 14 digits")
	@Column(name="cpf")
	@NotBlank(message="cpf cannot be null!")
	private String ownerCpf;

	@NotNull(message="Owner name cannot be null!")
	@Column(name="ownerName")
	@NotBlank(message = "Owner Name field must be completed")
	private String ownerName;

	@NotBlank(message = "Address field must be completed")
	@Column(name="address")
	private String address;

	@NotBlank(message = "City field needs to be completed")
	@Column(name="city")
	private String city;

	@Size(min= 2,message = "State must be at least 2 characters")
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

	public String getNameOfTheEstablishment() {
		return nameOfTheEstablishment;
	}

	public void setNameOfTheEstablishment(String nameOfTheEstablishment) {
		this.nameOfTheEstablishment = nameOfTheEstablishment;
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

	public String getOwnerCpf() {
		return ownerCpf;
	}

	public void setOwnerCpf(String ownerCpf) {
		this.ownerCpf = ownerCpf;
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