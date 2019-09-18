//package com.br.zup.models;
//
//import org.junit.Before;
//import static org.junit.Assert.assertEquals;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import java.util.Arrays;
//import static org.mockito.BDDMockito.given;
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import com.br.zup.Controller.EstablishmentController;
//import com.br.zup.Models.Establishment;
//import com.br.zup.Service.EstablishmentService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@WebMvcTest(EstablishmentController.class)
//@RunWith(SpringRunner.class)
//public class establishmentTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private EstablishmentService establishmentService;
//
//	private Establishment establishment;
//
//	@Test
//	public void testGetName() {
//		assertEquals("",establishment.getName());
//	}
//	@Test
//	public void testAddEstablishment() throws Exception {
//		establishment.setId(1);
//		given(establishmentService.saveEstablishment(establishment)).willReturn(establishment);
//	}
//	@Test
//	public void testDeleteEstablishment() throws Exception {
//		this.mockMvc.perform(delete("/establishment/{id}", 2))
//		.andExpect(status().isAccepted());
//	}
//	public static String transformarEmJson(final Object obj) {
//		try {
//			return new ObjectMapper().writeValueAsString(obj);
//		}
//		catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
//}