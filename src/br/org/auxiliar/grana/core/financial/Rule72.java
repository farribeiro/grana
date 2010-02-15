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
  private String resultado;
  private FinancialTools ft = new FinancialTools();

  private BigDecimal calculate() {
    return rule.divide(tax);
  }

  public String getResultInMonths() {
    return calculate().toString();
  }

  // TODO Repensar na logica deste metodo
  public String getExtendedResult() {
    resultado = calculate().divide(ft.getMonthsInYear()).abs().toString();
    if (calculate().intValue() > 1)
      resultado = resultado + " anos";
    else if (calculate().intValue() == 1)
      resultado = resultado + "ano";

    if ((calculate().intValue() % 12) != 0)
      resultado = resultado + " e " + (calculate().intValue() % 12) + " meses";


    return resultado;
  }

  public Rule72(String i) {
    this.tax = new BigDecimal(pn.RemoveMarks(i));
  }
}
