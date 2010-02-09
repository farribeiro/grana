package br.org.auxiliar.grana.core.administrativo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.org.auxiliar.grana.core.administrative.People;

/**
 * 
 * @author fabio
 */
public class FisicasTest {

	private People person = new People();

	// private PatternTime pd = new PatternTime();

	// @Test
	// public void TestTodayAge() {
	// person = new People(pd.getTodayDDMMAAAAFormat());
	// assertEquals("26", person.getAge());
	// }
	//
	// @Test
	// public void TestTomorrowAge() {
	// tomorrow.add(Calendar.DAY_OF_MONTH, 1);
	// assertEquals("24", person.getAge());
	// }

	@Test
	public void TestMaioridade() {
		assertEquals(true, person.isAdult("25"));
		assertEquals(true, person.isAdult("21"));
		assertEquals(false, person.isAdult("20"));
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		person = null;
	}
}
