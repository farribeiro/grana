package br.org.auxiliar.grana.core.financial;

import org.junit.Assert;
import org.junit.Test;

public class Rule72Test {

	private Rule72 rule = new Rule72("0.5");

	@Test
	public void Rule72() {
		Assert.assertEquals("144", rule.getResultInMonth());
		Assert.assertEquals("12", rule.getResultInYear());
	}
}