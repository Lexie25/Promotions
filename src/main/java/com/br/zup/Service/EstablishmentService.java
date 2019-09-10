package com.br.zup.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.br.zup.Models.Establishment;
import com.br.zup.Repositories.EstablishmentRepository;
import com.br.zup.exceptions.EstablishmentNoFoundException;

@Service

public class EstablishmentService {

	@Autowired
	private EstablishmentRepository establishmentRepository;
	
	public  Iterable<Establishment> getEstablishment() {
		return establishmentRepository.findAll();
	}
	
	public Establishment getEstablishmentById (int id) {
		return establishmentRepository.findById(id).get();
	}
	
	public void saveEstablishment(Establishment establishment) {
		establishmentRepository.save(establishment);
	}

	public void updateEstablishment(int id,Establishment establishment) {
		Optional<Establishment> opitonalEstablishment = establishmentRepository.findById(id);
		if(!opitonalEstablishment.isPresent()) {
			throw new EstablishmentNoFoundException("There are no messages with this id");
		}
		establishment.setId(id);
		establishmentRepository.save(establishment);
	}
	public void deleteEstablishment(int id) {
		try {
			establishmentRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new EstablishmentNoFoundException("There are no messages with this id");
		}
	}
	public long quantityOfEstablishment() {
		return establishmentRepository.count();
	}
}
	

