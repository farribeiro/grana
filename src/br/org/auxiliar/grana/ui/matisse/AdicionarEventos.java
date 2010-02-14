/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Eventos.java
 *
 * Created on Feb 13, 2010, 11:50:16 PM
 */

package br.org.auxiliar.grana.ui.matisse;

import br.org.auxiliar.grana.core.administrative.Eventos;

/**
 * 
 * @author fabio
 */
public class AdicionarEventos extends javax.swing.JInternalFrame {

	/** Creates new form Eventos */
	public AdicionarEventos() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		grpEvento = new javax.swing.JPanel();
		Entrada = new javax.swing.JRadioButton();
		Saida = new javax.swing.JRadioButton();
		labelValor = new javax.swing.JLabel();
		valor = new javax.swing.JFormattedTextField();
		labelDescricao = new javax.swing.JLabel();
		descricao = new javax.swing.JTextField();
		btnOK = new javax.swing.JButton();
		btnCancelar = new javax.swing.JButton();

		setClosable(true);
		setTitle("Eventos");

		grpEvento.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Evento"));

		Entrada.setText("Entrada");

		Saida.setText("Saída");

		javax.swing.GroupLayout grpEventoLayout = new javax.swing.GroupLayout(
				grpEvento);
		grpEvento.setLayout(grpEventoLayout);
		grpEventoLayout
				.setHorizontalGroup(grpEventoLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								grpEventoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												grpEventoLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(Entrada)
														.addComponent(Saida))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		grpEventoLayout
				.setVerticalGroup(grpEventoLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								grpEventoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(Entrada)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(Saida)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		labelValor.setLabelFor(valor);
		labelValor.setText("Valor");

		valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter()));

		labelDescricao.setLabelFor(descricao);
		labelDescricao.setText("Descrição");

		btnOK.setMnemonic('o');
		btnOK.setText("OK");
		btnOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnOKActionPerformed(evt);
			}
		});

		btnCancelar.setMnemonic('c');
		btnCancelar.setText("Cancelar");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								valor,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								117,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								labelDescricao)
																						.addComponent(
																								descricao,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								257,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								labelValor))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				grpEvento,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				btnOK)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btnCancelar)))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																grpEvento,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				labelValor)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				valor,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				labelDescricao)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				descricao,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(btnOK)
														.addComponent(
																btnCancelar))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnOKActionPerformed
		evento = new Eventos(valor.getText(), descricao.getText(), 'c');
	}// GEN-LAST:event_btnOKActionPerformed

	private Eventos evento;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JRadioButton Entrada;
	private javax.swing.JRadioButton Saida;
	private javax.swing.JButton btnCancelar;
	private javax.swing.JButton btnOK;
	private javax.swing.JTextField descricao;
	private javax.swing.JPanel grpEvento;
	private javax.swing.JLabel labelDescricao;
	private javax.swing.JLabel labelValor;
	private javax.swing.JFormattedTextField valor;
	// End of variables declaration//GEN-END:variables

}
