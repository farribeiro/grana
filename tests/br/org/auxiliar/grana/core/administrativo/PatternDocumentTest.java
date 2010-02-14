package br.org.auxiliar.grana.core.administrativo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.org.auxiliar.grana.core.base.PatternDocument;

public class PatternDocumentTest {

	private PatternDocument pd = new PatternDocument("312.509.068-73");

	@Test
	public void TestMascara() {

		assertEquals("31250906873", pd.removeMask());
		// assertEquals("111222333000181", person.removeMask()));
	}
}