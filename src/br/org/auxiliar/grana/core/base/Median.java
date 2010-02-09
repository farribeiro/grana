package br.org.auxiliar.grana.core.base;

import java.math.BigDecimal;
import java.util.HashSet;

public class Median {

	private HashSet<BigDecimal> array = new HashSet<BigDecimal>();
	private BigDecimal sum = null;

	public void add(String value){
		array.add(new BigDecimal(value));
	}
	
	private String arithimetri() {
		return "";
	}
}
