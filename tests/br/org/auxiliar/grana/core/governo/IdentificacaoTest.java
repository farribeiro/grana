package br.org.auxiliar.grana.core.governo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.org.auxiliar.grana.core.patterns.brazil.documents.Identifications;

/**
 * 
 * @author fabio
 */
public class IdentificacaoTest {

	private Identifications id;

	@Test
	public void TestCPF() {
		id = new Identifications("31250906873");
		assertEquals(true, id.isCPFValido());
		id = null;
		id = new Identifications("95901701887");
		assertEquals(true, id.isCPFValido());
	}

	@Test
	public void TestRG() {
		id = new Identifications("425410985");
		assertEquals(true, id.isRGValido());
		id = new Identifications("425410146");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		id = null;
	}
}