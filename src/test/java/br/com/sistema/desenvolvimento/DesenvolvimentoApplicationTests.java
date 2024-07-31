package br.com.sistema.desenvolvimento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class DesenvolvimentoApplicationTests {

	@Test
	void contextLoads() {

		boolean verdadeiro = (5 > 20);
		Assertions.assertTrue(verdadeiro);
	}

	void deveCalcularSomaDosSalarios(){

	}

}
