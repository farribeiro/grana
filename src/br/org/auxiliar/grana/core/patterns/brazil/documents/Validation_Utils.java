package br.org.auxiliar.grana.core.patterns.brazil.documents;

/**
 * 
 * @author fabio
 */
public class Validation_Utils {

	private final int modulo = 11;
	private String document;

	public Validation_Utils(final String doc) {
		document = doc;
	}

	public int getLength(int value) {
		return document.length() - value;
	}

	public int getModulo11(final int value) {
		return (value % modulo);
	}

	/**
	 * <p>
	 * Calculo para documentos brasileiros como Registro Geral(sigla: RG),
	 * Cadastro de Pessoa Física(sigla: CPF e também conhecido como CIC),
	 * Cadastro Nacional de Pessoas Juridicas(Sigla: CPNJ) e Inscrição
	 * Estadual(sigla IE)
	 * </p>
	 * 
	 * @param doc
	 *            Documento a ser calculado
	 * @param qt
	 *            Quantidade de Digitos a serem calculados
	 * @param mult
	 *            Multiplicador
	 * @return Soma do calculo para DV
	 * 
	 *         <p>
	 *         <strong>Exemplo:</strong> <code>
     *  Pessoas p = new Pessoas();
     * </code>
	 *         </p>
	 */
	public int getSum(final int qt, final int mult) {
		int soma = 0;
		int i = 0;
		int multiplicador = mult;

		while (i < qt) {
			soma += Integer.parseInt(document.substring(i, i + 1))
					* multiplicador;
			i++;
			multiplicador--;
		}
		return soma;
	}
}
