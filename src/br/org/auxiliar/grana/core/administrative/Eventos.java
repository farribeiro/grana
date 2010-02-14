/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.auxiliar.grana.core.administrative;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Eventos {

  private Evento evento;
  private String v;

  public Eventos(String valor, String descricao, char tipoEvento) {
    v = valor.replace(".", "");
    v = v.replace(",", ".");
    evento = new Evento(new BigDecimal(valor), descricao, tipoEvento);
    try {
      evento.save();
    } catch (Exception e) {
    }
  }
}
