/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.auxiliar.grana.core.administrative;

import java.math.BigDecimal;

import br.org.auxiliar.grana.core.base.PatternsNumbers;

/**
 * 
 * @author fabio
 */
public class Eventos {

	private Evento evento;
	private PatternsNumbers np = new PatternsNumbers();

	public Eventos(String valor, String descricao, char tipoEvento) {
		evento = new Evento(new BigDecimal(np.RemoveMarks(valor)), descricao,
				tipoEvento);
		try {
			evento.save();
		} catch (Exception e) {
		}
	}
}
