package br.org.auxiliar.grana.core.financial;

import java.math.BigDecimal;

public class Investment80_20 {
	private final BigDecimal Investiment = new BigDecimal(80);
	private final BigDecimal Cost = new BigDecimal(20);
	private BigDecimal Amount;

	public Investment80_20(String amount) {
		Amount = new BigDecimal(amount);
	}

	public String getCost() {
		return Amount.multiply(Cost).toString();
	}

	public String getInvestment() {
		return Amount.multiply(Investiment).toString();
	}

}
