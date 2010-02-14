/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.auxiliar.grana.core.financial;

import java.math.BigDecimal;

/**
 *
 * @author fabio
 */
public class Eventos {

  private Evento evento;

  public Eventos(String valor, String descricao, char tipoEvento) {
    evento = new Evento(new BigDecimal(valor), descricao, tipoEvento);
  }


}
