package br.org.auxiliar.grana.core.financial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author fabio
 */
public class FinancialToolsTest {

	private FinancialTools ft = new FinancialTools("100", "10");

	@Test
	public void TestJuros() {
		assertEquals("110", ft.getPlus());
		assertEquals("90", ft.getDiscount());
		assertEquals("10", ft.getCash());
	}

	// @Test
	// public void TestPeriodo() {
	// assertEquals("30", ft.getYearPeriod("360"));
	// assertEquals("360", ft.getMonthPeriod("30"));
	// }

}
