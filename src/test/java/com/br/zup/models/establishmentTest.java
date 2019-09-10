package com.br.zup.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.br.zup.Models.Establishment;

@RunWith(SpringRunner.class)
public class establishmentTest {
	
	private Establishment establishment;
	
	@Before
	public void test() {
		establishment = new Establishment();		
	}

	@Test
	public void testGetName() {
		assertEquals("",establishment.getName());
	}
}
