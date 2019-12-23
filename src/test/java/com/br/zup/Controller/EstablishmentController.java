//package com.br.zup.Controller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.br.zup.Models.Establishment;
//import com.br.zup.Service.EstablishmentService;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class EstablishmentController {
//
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private EstablishmentService establishmentService;
//
//	@Autowired
//	private Establishment establishment;
//
//	@Test
//	public void testGetEstablishment() throws Exception {
//		List<Establishment> contas = Arrays.asList(establishment);
//
//		given(establishmentService..willReturn(establishment);
//		
//
//		this.mockMvc.perform(get("/establishment"))
//		.andExpect(status().isOk());
//		
//	}
//
//}
