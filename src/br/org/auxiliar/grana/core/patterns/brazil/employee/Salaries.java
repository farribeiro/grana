package br.org.auxiliar.grana.core.patterns.brazil.employee;

import java.math.BigDecimal;

import br.org.auxiliar.grana.core.financial.FinancialTools;

public class Salaries {

	private Salary salary;
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
	public Salaries(String solid_salary, String months, String tax) {
		salary = new Salary(new BigDecimal(solid_salary), Integer
				.parseInt(months), new BigDecimal(tax));
	}

	/*
	 * This constructor is to get day/hour cashes / extra cashes
	 * 
	 * @param solid_salary The solid salary to calculate the hour cash
	 */
	// public Salaries(String solid_salary) {
	// salary.setSolidSalary(new BigDecimal(solid_salary));
	// }

	/**
	 * This class calculate the brazilian 13th Salary and set to solid salary to
	 * calculate the INSS
	 * 
	 * @return 13th Solid Salary
	 */
	public String get13thSalary() {
		BigDecimal s = salary.getSolidSalary().multiply(
				new BigDecimal(salary.getMonths()))
				.divide(ft.getMonthsInYear());

		return ft.getCurrency_Format().format(s.doubleValue());
	}

	public String getINSS() {
		return ft.getCurrency_Format().format(
				salary.getSolidSalary().multiply(salary.getTax()).divide(
						ft.getCem()).doubleValue());
	}

	public String getDayCash() {
		return ft.getCurrency_Format().format(
				salary.getSolidSalary().divide(salary.getMaxDaysInTheMonth()));
	}

	public String getHourCash() {
		return ft.getCurrency_Format().format(
				salary.getSolidSalary().divide(salary.getMaxDaysInTheMonth())
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
