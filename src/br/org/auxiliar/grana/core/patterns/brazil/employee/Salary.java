package br.org.auxiliar.grana.core.patterns.brazil.employee;

import java.math.BigDecimal;

/**
 * @author fabio
 * 
 */
public class Salary {
	private final BigDecimal MaximalTax_INS = new BigDecimal(12.00);
	private final BigDecimal MinimalTax_INSS = new BigDecimal(9);
	private final BigDecimal maxDaysInTheMonth = new BigDecimal(30);
	private final BigDecimal maxHourForDay = new BigDecimal(8);
	private final BigDecimal maxHourForWeek = new BigDecimal(44);
	private final BigDecimal MinTax = new BigDecimal(8);
	private final BigDecimal MaxTax = new BigDecimal(12);
	private BigDecimal solid_salary;
	private BigDecimal months;
	private BigDecimal tax;

	public BigDecimal getSolid_salary() {
		return solid_salary;
	}

	public void setSolid_salary(BigDecimal solidSalary) {
		solid_salary = solidSalary;
	}

	public BigDecimal getMonths() {
		return months;
	}

	public void setMonths(BigDecimal months) {
		this.months = months;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getMaximalTax_INS() {
		return MaximalTax_INS;
	}

	public BigDecimal getMinimalTax_INSS() {
		return MinimalTax_INSS;
	}

	public BigDecimal getMaxDaysInTheMonth() {
		return maxDaysInTheMonth;
	}

	public BigDecimal getMaxHourForDay() {
		return maxHourForDay;
	}

	public BigDecimal getMaxHourForWeek() {
		return maxHourForWeek;
	}

	public BigDecimal getMinTax() {
		return MinTax;
	}

	public BigDecimal getMaxTax() {
		return MaxTax;
	}
}
