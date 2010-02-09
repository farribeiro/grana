package br.org.auxiliar.grana.core.financial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ROITest {

	private ROI r = new ROI("80.000", "2.000");
	
	@Test
	public void ReturnTax(){
		assertEquals("2,50", r.returnTaxYear());
	}
	
	@Test
	public void Investment() {
		assertEquals("40", r.prazo_Investment());
	}
}
