/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Juros.java
 *
 * Created on Feb 14, 2010, 10:30:02 PM
 */

package br.org.auxiliar.grana.ui.matisse;

import br.org.auxiliar.grana.core.financial.Rule72;

/**
 * 
 * @author fabio
 */
public class Juros extends javax.swing.JInternalFrame {

	/** Creates new form Juros */
	public Juros() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		Fechar = new javax.swing.JButton();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		Rule72 = new javax.swing.JPanel();
		labelAliquota = new javax.swing.JLabel();
		aliquota = new javax.swing.JFormattedTextField();
		grpResultado = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		btnCalcular = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();

		setClosable(true);
		setTitle("Juros");

		Fechar.setMnemonic('f');
		Fechar.setText("Fechar");
		Fechar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				FecharActionPerformed(evt);
			}
		});

		labelAliquota.setLabelFor(aliquota);
		labelAliquota.setText("Aliquota ( % )");

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		jLabel1.setText("jLabel1");

		javax.swing.GroupLayout grpResultadoLayout = new javax.swing.GroupLayout(
				grpResultado);
		grpResultado.setLayout(grpResultadoLayout);
		grpResultadoLayout.setHorizontalGroup(grpResultadoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						grpResultadoLayout.createSequentialGroup()
								.addContainerGap().addComponent(jLabel1)
								.addContainerGap(180, Short.MAX_VALUE)));
		grpResultadoLayout.setVerticalGroup(grpResultadoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						grpResultadoLayout.createSequentialGroup()
								.addContainerGap().addComponent(jLabel1)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		btnCalcular.setMnemonic('c');
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCalcularActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout Rule72Layout = new javax.swing.GroupLayout(
				Rule72);
		Rule72.setLayout(Rule72Layout);
		Rule72Layout
				.setHorizontalGroup(Rule72Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								Rule72Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												Rule72Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																aliquota,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																289,
																Short.MAX_VALUE)
														.addComponent(
																labelAliquota)
														.addComponent(
																btnCalcular)
														.addComponent(
																grpResultado,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		Rule72Layout
				.setVerticalGroup(Rule72Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								Rule72Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(labelAliquota)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												aliquota,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												grpResultado,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(12, 12, 12).addComponent(
												btnCalcular).addContainerGap(
												35, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Regra 72", Rule72);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 313,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 183,
				Short.MAX_VALUE));

		jTabbedPane1.addTab("tab2", jPanel2);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(
								224, Short.MAX_VALUE).addComponent(Fechar)
								.addContainerGap()).addGroup(
						jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jTabbedPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										318, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(219, Short.MAX_VALUE)
										.addComponent(Fechar).addContainerGap())
						.addGroup(
								jPanel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												jPanel1Layout
														.createSequentialGroup()
														.addComponent(
																jTabbedPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																210,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addContainerGap(46,
																Short.MAX_VALUE))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void FecharActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FecharActionPerformed
		this.dispose();
	}// GEN-LAST:event_FecharActionPerformed

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCalcularActionPerformed
		try {
			rule72 = new Rule72(aliquota.getText());
			jLabel1.setText(rule72.getExtendedResult());
			rule72 = null;
		} catch (Exception e) {
			jLabel1.setText("Erro no calculo.");
		}
	}// GEN-LAST:event_btnCalcularActionPerformed

	private Rule72 rule72;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Fechar;
	private javax.swing.JPanel Rule72;
	private javax.swing.JFormattedTextField aliquota;
	private javax.swing.JButton btnCalcular;
	private javax.swing.JPanel grpResultado;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JLabel labelAliquota;
	// End of variables declaration//GEN-END:variables

}
