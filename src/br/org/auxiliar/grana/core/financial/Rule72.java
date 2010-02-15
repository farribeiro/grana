package br.org.auxiliar.grana.core.financial;

import br.org.auxiliar.grana.core.base.PatternNumber;
import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Rule72 {

  private final BigDecimal rule = new BigDecimal(72);
  private BigDecimal tax;
  private PatternNumber pn = new PatternNumber();

  public Rule72(String i) {
    this.tax = new BigDecimal(pn.RemoveMarks(i));
  }

  private BigDecimal calculate() {
    return rule.divide(tax);
  }

  public String getResultInMonth() {
    return calculate().toString();
  }

}
