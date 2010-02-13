package br.org.auxiliar.grana.core.governo.employee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.org.auxiliar.grana.core.patterns.brazil.employee.Salaries;

public class SalaryTest {

	private Salaries s;

	@Test
	public void Salary_13thTest() throws Exception {
		s = new Salaries("1108.11", "5");
		assertEquals("88,65", s.getINSS());
		assertEquals("461,71", s.get13thSalary());
		assertEquals("36,94", s.getINSS());
		s = null;
	}

	@Test
	public void HourCashesTest() throws Exception {
		s = new Salaries("1108.11");
		assertEquals("36,94", s.getDayCash());
		assertEquals("4,62", s.getHourCash());
		assertEquals(String.valueOf(Integer.parseInt(s.getHourCash()) * 2), s
				.get100PercentExtraHour());
	}

}