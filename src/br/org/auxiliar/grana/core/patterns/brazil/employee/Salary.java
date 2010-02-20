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
	private BigDecimal solidSalary;
	private int months;
	private BigDecimal tax;

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

	// private void setTax() {
	// if (salary.getSolid_salary().doubleValue() <= 1200)
	// salary.setTax(salary.getMinimalTax_INSS());
	// else
	// salary.setTax(salary.getMaximalTax_INS());
	// }

	public BigDecimal getSolidSalary() {
		return solidSalary;
	}

	public int getMonths() {
		return months;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public Salary(BigDecimal solidSalary, int months, BigDecimal tax) {
		this.solidSalary = solidSalary;
		this.months = months;
		this.tax = tax;
	}
}
