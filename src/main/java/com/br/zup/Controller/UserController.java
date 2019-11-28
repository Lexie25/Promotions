package com.br.zup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.zup.Service.UserAdminService;

@RequestMapping("/admin")
@RestController
public class UserController {

	private UserAdminService userAdminService;
	
	@Autowired
	public UserController(UserAdminService usuarioService) {
		this.userAdminService = usuarioService;
	}

}