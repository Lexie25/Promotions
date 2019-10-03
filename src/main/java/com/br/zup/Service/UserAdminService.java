package com.br.zup.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.Models.UserAdmin;
import com.br.zup.Repositories.UserAdminRepository;

@Service
public class UserAdminService {

	private final UserAdminRepository userAdminRepository;

    @Autowired
    public UserAdminService(UserAdminRepository userAdminRepository) {
        this.userAdminRepository = userAdminRepository;
    }

    public UserAdmin save(UserAdmin userAdmin) {
        return userAdminRepository.save(userAdmin);
    }
	
}
