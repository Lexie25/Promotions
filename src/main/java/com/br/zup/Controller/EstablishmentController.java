package com.br.zup.Controller; 

import org.springframework.http.ResponseEntity;
import com.br.zup.Models.Establishment;
import com.br.zup.Models.RegisterEstablishmentRequest;
import com.br.zup.Models.UserAdmin;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.br.zup.Service.EstablishmentService;
import com.br.zup.Service.UserAdminService;

import io.swagger.annotations.Api;

@Api(value="Api rest establishment")
@RestController
@RequestMapping("/establishment")
public class EstablishmentController {

	@Autowired
	private UserAdminService userAdminService;


	@Autowired
	private EstablishmentService establishmentService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity showAllEstablishment() {
		return ResponseEntity.ok(establishmentService.showAllEstablishment());
	}

	@ApiOperation(value="picks up an establishment by Id")
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getEstablishment(@PathVariable int id,@RequestBody RegisterEstablishmentRequest registerEstablishmentRequest){
		System.out.println(registerEstablishmentRequest.user.getIdUser());
		UserAdmin userAuthorized = userAdminService.getUserAdminById(registerEstablishmentRequest.user.getIdUser());
		if(userAuthorized.isAdmin()) {
			try {
				Establishment establishment = establishmentService.getEstablishmentById(id);
				return ResponseEntity.ok(establishment);
			}
			catch(Exception e){
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

	@PostMapping( produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	//@PostMapping( produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="addEstablishment")
	public ResponseEntity<?>addEstablishment( @RequestBody RegisterEstablishmentRequest registerEstablishmentRequest){
		//System.out.println("NameUser: "+registerEstablishmentRequest.user.getIdUser());
		UserAdmin userAuthorized = userAdminService.getUserAdminById(registerEstablishmentRequest.user.getIdUser());
		if(userAuthorized.isAdmin()) {
			try{
				establishmentService.addEstablishment(registerEstablishmentRequest);
				System.out.println(registerEstablishmentRequest);
				return ResponseEntity.status(HttpStatus.CREATED).body(registerEstablishmentRequest.establishment);
			} catch(Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();}
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

	@ApiOperation(value=" delete an establishments")
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> deleteEstablishment(@PathVariable int id, @RequestBody UserAdmin userAdmin){
		UserAdmin userAuthorized = userAdminService.getUserAdminById(userAdmin.getIdUser());
		if(userAuthorized.isAdmin()){
			establishmentService.deleteEstablishment(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

	@ApiOperation(value="update an establishment")
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?>updateEstablishment(@PathVariable int id,@Valid @RequestBody Establishment establishment, @RequestBody UserAdmin userAdmin){
		UserAdmin userAuthorized = userAdminService.getUserAdminById(userAdmin.getIdUser());
		if(userAuthorized.isAdmin()){

			establishmentService.updateEstablishment(id, establishment);
			return ResponseEntity.ok(establishment);

		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

}