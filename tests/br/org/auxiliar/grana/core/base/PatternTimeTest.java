package br.org.auxiliar.grana.core.base;

import org.junit.Assert;
import org.junit.Test;

public class PatternTimeTest {

	private PatternTime d = new PatternTime();

	// @Test
	// public void TestTodayDDMMAAAA() {
	// Assert.assertEquals("28/02/2009", d.getTodayDDMMAAAAFormat());
	// }
	//
	// @Test
	// public void TestTodayAAAMMDD() {
	// Assert.assertEquals("2009/02/28", d.getTodayAAAAMMDDFormat());
	// }

	@Test
	public void TotalMonthsTest() {
		Assert.assertEquals("12", d.getTotalofMonths());
	}
}
