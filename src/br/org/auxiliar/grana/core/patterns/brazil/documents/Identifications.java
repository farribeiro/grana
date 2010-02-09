package br.org.auxiliar.grana.core.patterns.brazil.documents;

/**
 * 
 * @author fabio
 */
public class Identifications {

	private Identification id = new Identification();
	private final int modulo = 11;
	private String document;
	private int QuantidadeDigitos;
	private int Multiplicador;

	private int getQuantidadeDigitos(final int i){
		return document.length() - i;
	}

	private int getCalculaCPF() {
		return 11 - getCalcula();
	}

	private int getCalcula() {
		return getModulo11(getSum());
	}

	public boolean isCPFValido() {
		// int digito1 = 11 - getModulo11(getSum(getLength(id
		// .getVerificationDigitsCPF()), 10));
		// int digito2 = 11 - getModulo11(getSum(getLength(id
		// .getVerificationDigitsCPF()), 11));
		int digito1 = getCalculaCPF();
		Multiplicador = 11;
		int digito2 = 11 - getModulo11(getSum() + (digito1 * 2));

		String result = String.valueOf(digito1) + String.valueOf(digito2);
		String digit = document.substring(getLength(id
				.getVerificationDigitsCPF()), document.length());

		return result.equals(digit);
	}

	public boolean isRGValido() {
		// int result = getModulo11(getSum(
		// getLength(id.getVerificationDigitsRG()), 9));

		int result = getCalcula();

		String digit = document.substring(getLength(id
				.getVerificationDigitsRG()), document.length());

		return String.valueOf(result).equals(digit);
	}

	// TODO refazer este método que está obsoleto
	// @Deprecated
	// public boolean isValidCNPJ(final String doc) {
	// document = doc;
	// int first_digit = Commons.somaDigito(doc, Corp.getDigitosCNPJ(), Corp
	// .getDigitosCNPJ()) / 11;
	// int second_digit = Commons.somaDigito(doc, Corp.getDigitosCNPJ() - 1,
	// Corp.getDigitosCNPJ())
	// + (first_digit * 1) / 11;
	//
	// String results = String.valueOf(first_digit)
	// + String.valueOf(second_digit);
	// String digits = doc.substring(doc.length() - 1, doc.length());
	//
	// return digits.equals(results);
	// }

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
	// public int getSum(final int qt, final int mult) {
	// int soma = 0;
	// int i = 0;
	// int multiplicador = mult;
	//
	// while (i < qt) {
	// soma += Integer.parseInt(document.substring(i, i + 1))
	// * multiplicador;
	// i++;
	// multiplicador--;
	// }
	// return soma;
	// }
	public int getSum() {
		int soma = 0;
		int i = 0;

		while (i < QuantidadeDigitos) {
			soma += Integer.parseInt(document.substring(i, i + 1))
					* Multiplicador;
			i++;
			Multiplicador--;
		}
		return soma;
	}

	public Identifications(final String doc) {
		document = doc;
		if (document.length() == id.getLength_CPF()) {
			QuantidadeDigitos = getQuantidadeDigitos(id.getVerificationDigitsCPF());
			Multiplicador = 10;
		}
		if (document.length() == id.getLength_RG()) {
			QuantidadeDigitos = getQuantidadeDigitos(id.getVerificationDigitsRG());
			Multiplicador = 9;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		id = null;
	}

}