//package com.br.zup.Service;
//
//import org.assertj.core.api.ErrorCollector;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.rules.ExpectedException;
//import org.mockito.Mockito;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.br.zup.Models.Establishment;
//import com.br.zup.Repositories.EstablishmentRepository;
//
//
//public class EstablishmentService {
//
//	private EstablishmentService establishmentService;
//	private EstablishmentRepository establishmentRepository;
//	private Establishment Establishment;
//	
//	
//	
//	@Rule
//	public ErrorCollector error = new ErrorCollector();
//	
//	@Rule
//	public ExpectedException exception = ExpectedException.none();
//	
//	
//	@Before
//	public void setUp() {
//		establishmentService = new EstablishmentService();
//		this.establishmentService = new EstablishmentService();
//        establishmentRepository= Mockito.mock(establishmentRepository.class);
//        establishmentService.setEstablishmentRepository(establishmentRepository);
//
//        people = new People();
//
//        people.setId(16);
//        people.setNome("Joao Carlos");
//        people.setCpf("22233345678");
//	  
//	       
//	    }
//
//
//	
//}
