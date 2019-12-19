package com.br.zup.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.zup.Models.UserAdmin;
import com.br.zup.Service.UserAdminService;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/user")
@RestController
public class UserController {

	private UserAdminService userAdminService;
	
	@Autowired
	public UserController(UserAdminService userService) {
		this.userAdminService = userService;
	}
	
	@GetMapping
	public ResponseEntity<?> showAllUserAdmin() {
		return ResponseEntity.ok(userAdminService.showAllUserAdmin());
	}

	@ApiOperation(value="get a user by Id")
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserAdmin(@PathVariable int id){
		try {
			UserAdmin userAdmin = userAdminService.getUserAdminById(id);
			return ResponseEntity.ok(userAdmin);
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}	

	@ApiOperation(value="add a user")
	@PostMapping
	public ResponseEntity<?> addUserAdmin(@Valid @RequestBody UserAdmin user){
			userAdminService.saveUser(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}

}