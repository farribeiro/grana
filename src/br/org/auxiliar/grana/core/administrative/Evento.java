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
public class Evento {
	private BigDecimal valor;
	private String descricao;
	private char tipoEvento;

	public Evento(BigDecimal valor, String descricao, char tipoEvento) {
		this.valor = valor;
		this.descricao = descricao;
		this.tipoEvento = tipoEvento;
	}

	public void save() {

	}
}
