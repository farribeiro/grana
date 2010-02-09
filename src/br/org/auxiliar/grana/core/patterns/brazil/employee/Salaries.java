package br.org.auxiliar.grana.core.patterns.brazil.employee;

import java.math.BigDecimal;

import br.org.auxiliar.grana.core.financial.FinancialTools;

public class Salaries {

	private Salary salary = new Salary();
	private FinancialTools ft = new FinancialTools();

	// private PatternTime pt = new PatternTime();
	// private String date;

	/**
	 * The constructor is special for 13th salary
	 * 
	 * @param solid_salary
	 *            Solid salary for calculates the 13th salary
	 * @param months
	 *            Months worked in year
	 */
	public Salaries(String solid_salary, String months) {
		salary.setSolid_salary(new BigDecimal(solid_salary));
		salary.setMonths(new BigDecimal(months));
		setTax();
	}

	private void setTax() {
		if (salary.getSolid_salary().doubleValue() <= 1200)
			salary.setTax(salary.getMinimalTax_INSS());
		else
			salary.setTax(salary.getMaximalTax_INS());
	}

	/**
	 * This constructor is to get day/hour cashes / extra cashes
	 * 
	 * @param solid_salary
	 *            The solid salary to calculate the hour cash
	 */
	public Salaries(String solid_salary) {
		salary.setSolid_salary(new BigDecimal(solid_salary));
	}

	/**
	 * This class calculate the brazilian 13th Salary and set to solid salary to
	 * calculate the INSS
	 * 
	 * @return 13th Solid Salary
	 */
	public String get13thSalary() {
		salary.setSolid_salary(salary.getSolid_salary().multiply(
				salary.getMonths()).divide(ft.getMonthsInYear()));
		return ft.getCurrency_Format().format(
				salary.getSolid_salary().doubleValue());
	}

	public String getINSS() {
		return ft.getCurrency_Format().format(
				salary.getSolid_salary().multiply(salary.getTax()).divide(
						ft.getCem()).doubleValue());
	}

	public String getDayCash() {
		return ft.getCurrency_Format().format(
				salary.getSolid_salary().divide(salary.getMaxDaysInTheMonth()));
	}

	public String getHourCash() {
		return ft.getCurrency_Format().format(
				salary.getSolid_salary().divide(salary.getMaxDaysInTheMonth())
						.divide(salary.getMaxHourForDay()).doubleValue());
	}

	public String get75PercentExtraHour() {
		// return ft.getCurrency_Format().format(
		return "";
	}

	public String get100PercentExtraHour() {
		return "";
	}

}
