package br.org.auxiliar.grana.core;

import org.junit.Assert;
import org.junit.Test;

import br.org.auxiliar.grana.core.administrative.Cars;

public class CarsTest {

	private Cars lc;

	@Test
	public void Km4LitersTest() {
		lc = new Cars("0", "600", "60", "0");
		Assert.assertEquals("10,00", lc.getKm4Liters());
		lc = null;
	}

	@Test
	public void KmTest() {
		lc = new Cars("0", "600", "0", "0");
		Assert.assertEquals("600,00", lc.getKM());
		lc = new Cars("1", "600", "0", "0");
		Assert.assertEquals("599,00", lc.getKM());
		lc = null;
	}

	@Test
	public void CostKmTest() {
		lc = new Cars("0", "600", "0", "2.4");
		Assert.assertEquals("", lc.getCost4KmLiters());
	}
}