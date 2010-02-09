package br.org.auxiliar.grana.core.financial;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Rule72 {

	private final BigDecimal rule = new BigDecimal(72);
	private FinancialTools ft = new FinancialTools();
	private BigDecimal tax;

	public Rule72(String i) {
		this.tax = new BigDecimal(i);
	}

	private BigDecimal calculate() {
		return rule.divide(tax);
	}

	public String getResultInMonth() {
		return calculate().toString();
	}

	public String getResultInYear() {
		return calculate().divide(ft.getMonthsInYear()).toString();
	}
}
