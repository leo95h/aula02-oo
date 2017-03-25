package br.edu.unicesumar.test;
import org.junit.Assert;
import org.junit.Test;

import br.edu.unicesumar.Calculadora;


public class CalculadoraTest {
	@Test
	public void validaParTest(){
		Calculadora calculadora = new Calculadora();
		Assert.assertEquals("PAR", calculadora.validaSeValorEhPar(4));
		Assert.assertEquals("", calculadora.validaSeValorEhPar(5));
		Assert.assertFalse(calculadora.validaSeValorEhPar(4).isEmpty());
	}
	
	@Test
	public void validaImparTest(){
		Calculadora calculadora = new Calculadora();
		Assert.assertEquals("IMPAR", calculadora.validaSeValorEhImpar(5));
		Assert.assertEquals("", calculadora.validaSeValorEhImpar(6));
		Assert.assertFalse(calculadora.validaSeValorEhImpar(5).isEmpty());
	}
}
