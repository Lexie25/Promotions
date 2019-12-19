package com.br.zup.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.Models.UserAdmin;
import com.br.zup.Repositories.UserAdminRepository;

@Service
public class UserAdminService {

	@Autowired
	private UserAdminRepository userAdminRepository;

	public  Iterable<UserAdmin> showAllUserAdmin() {
		return userAdminRepository.findAll();
	}
	public UserAdmin getUserAdminById (long id) {
		return userAdminRepository.findById(id).get();

	}

	public void saveUser(UserAdmin userAdmin) {
		userAdminRepository.save(userAdmin);
	}
//	UserAdmin.setIdUserAdmin(idUser);
//	userAdminRepository.save(userAdmin);
}

