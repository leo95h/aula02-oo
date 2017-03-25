package br.edu.unicesumar;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Calculadora {

	private static Integer valorInicial = 2;

	public static void main(String[] args) {
		System.out.println("mensagem - oi mundo");
		Logger logger = LogManager.getLogger("Calculadora");
		logger.info("mensagem de teste do log");
		exemploDivisao();
		exemploMultiplicacao();
		exemploAdicao();
		exemploSubtracao();
		validaSeValorEhImpar(valorInicial);
		validaSeValorEhPar(valorInicial);
	}
	
	public static String validaSeValorEhPar(Integer valor) {
		if (valor % 2 == 0) {
			return "PAR";
		}
		return "";
	}	
	
	public static String validaSeValorEhImpar(Integer valor) {
		if (valor % 2 != 0) {
			return "IMPAR";
		}	
		return "";
	}

	public static void exemploSubtracao() {
		Integer resultadoDaSubtracao = valorInicial - 2;
	}

	public static void exemploAdicao() {
		Integer resultadoDaAdicao = valorInicial + 2;
	}

	public static void exemploMultiplicacao() {
		Integer resultadoDaMultiplicacao = valorInicial * 2;
	}

	public static void exemploDivisao() {
		Integer resultadoDaDivisao = valorInicial / 2;
	}
}
