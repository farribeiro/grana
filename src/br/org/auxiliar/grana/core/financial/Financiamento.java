package br.org.auxiliar.grana.core.financial;

import java.math.BigDecimal;

public class Financiamento {

	private FinancialTools ft = new FinancialTools();
	private BigDecimal LoanValue;

	public Financiamento(String loanvalue) {
		LoanValue = new BigDecimal(loanvalue);
	}

	/**
	 * Show the double value o bill account
	 * 
	 * @return Double Value of bill
	 */
	public String getDoubleLoanValue() {
		return LoanValue.multiply(new BigDecimal("2")).toString();
	}
	// TODO Mostrar o quanto irá pagar a mais do financimamento
	
	// TODO Mostrar quanto irá pagar pelo financiamento.
	public String getPaymentPlus() {
		return "";
	}

	// TODO Calcular simulação quanto está disposto arcar o financiamento
}
