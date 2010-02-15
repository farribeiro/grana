package br.org.auxiliar.grana.core.financial;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 
 * @author fabio
 */
public class FinancialTools {

	private DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");
	private final BigDecimal monthsInYear = new BigDecimal(12);
	private final BigDecimal cem = new BigDecimal(100);
	// private BigDecimal rescue_tax;
	// private BigDecimal monthly_intake;
	private BigDecimal present_value;
	private BigDecimal future_value;
	private BigDecimal tax;
	private BigDecimal n;

	private void calculate() {
		future_value = present_value.multiply(tax).divide(cem);
	}

	public FinancialTools(String pv, String i) {
		present_value = new BigDecimal(pv);
		tax = new BigDecimal(i);
	}

	public FinancialTools(String n) {
		this.n = new BigDecimal(n);
	}

	public FinancialTools() {
	}

	public DecimalFormat getCurrency_Format() {
		return currencyFormat;
	}

	public BigDecimal getCem() {
		return cem;
	}

	/**
	 * 
	 * @return Months in Years
	 */
	public BigDecimal getMonthsInYear() {
		return monthsInYear;
	}

	public String getPlus() {
		calculate();
		return future_value.add(present_value).toString();
	}

	public String getDiscount() {
		calculate();
		return present_value.subtract(future_value).toString();
	}

	public String getCash() {
		calculate();
		return future_value.toString();
	}

	public String getMonthlyPeriod() {
		return n.multiply(monthsInYear).toString();
	}

	public String getYearPeriod() {
		return n.divide(monthsInYear).toString();
	}

	public String getTax2Year() {
		return tax.divide(monthsInYear).toString();
	}

	// public FinancialTools(String i) {
	// tax = new BigDecimal(i);
	// }

	public String getTax2Months() {
		return tax.multiply(monthsInYear).toString();
	}

}