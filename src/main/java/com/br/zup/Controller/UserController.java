package com.br.zup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.zup.Models.UserAdmin;
import com.br.zup.Service.UserAdminService;

@RequestMapping("/admin")
@RestController
public class UserController {

	private UserAdminService userAdminService;
	
	@Autowired
    public UserController(UserAdminService usuarioService) {
        this.userAdminService = usuarioService;
    }

	@PostMapping
	public ResponseEntity<UserAdmin> salvar(@RequestBody UserAdmin dto) {
	    UserAdmin user = userAdminService.save(dto.transformaParaObjeto());
	    return new ResponseEntity<>(user, HttpStatus.CREATED);
	
}
}