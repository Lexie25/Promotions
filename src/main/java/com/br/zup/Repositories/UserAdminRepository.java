package com.br.zup.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.Models.UserAdmin;

@Repository
public interface UserAdminRepository extends CrudRepository<UserAdmin,Integer>{

}
