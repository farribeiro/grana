package br.org.auxiliar.grana.core.base;

public class PatternDocument {

	private String document;

	public PatternDocument(String document) {
		this.document = document;
	}

	/**
	 * 
	 * retirada de mascara para documentos
	 * 
	 * @param document
	 *            Documento a ser retitrado a mascara
	 * @return Documento sem mascara
	 */
	public String removeMask() {
		return document.replace(".", "").replace("-", "").replace("/", "")
				.replace("@", "");
	}
}