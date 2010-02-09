package br.org.auxiliar.grana.core.patterns.brazil.financial;

import br.org.auxiliar.grana.core.patterns.brazil.documents.Validation_Utils;

/**
 * 
 * @author fabio
 */
public class Banks {

	private String document;
	private Bank bank = new Bank();
	private Validation_Utils validation = new Validation_Utils(document);

	public Banks(final String doc) {
		document = doc;
	}

	public boolean isAgenciaBancariaValida() {
		int resultado = validation.getModulo11(validation.getSum(validation
				.getLength(bank.getQtDigitosAgenciasBancaria()), 5));
		String digito = document.substring(validation.getLength(bank
				.getQtDigitosAgenciasBancaria()), document.length());

		return String.valueOf(resultado).equals(digito);
	}

	public boolean isContaValida() {
		int resultado = validation.getModulo11(validation.getSum(validation
				.getLength(bank.getQtDigitosAgenciasBancaria()), document
				.length()
				- bank.getQtDigitosAgenciasBancaria()));
		String digito = document.substring(validation.getLength(bank
				.getQtDigitosAgenciasBancaria()), document.length());

		return String.valueOf(resultado).equals(digito);
	}
}
