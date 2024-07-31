package br.com.sistema.desenvolvimento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class DesenvolvimentoApplicationTests {

	@Test
	void deveRetornarVerdadeiroSeCincoMaior() {
		boolean verdadeiro = (5 > 2);
		Assertions.assertTrue(verdadeiro);
	}

	
}
