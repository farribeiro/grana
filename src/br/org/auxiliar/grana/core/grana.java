package br.org.auxiliar.grana.core;

import br.org.auxiliar.grana.ui.text.TextUI;

/**
 * 
 * @author fabio
 */
public class grana {

	private String system_arguments[] = null;;

	public grana(String args[]) {
		system_arguments = args;

		// switch (system_arguments[0]) {
		// case "daemon":
		//			
		// break;
		// case "text":
		// new TextUI();
		// default:
		//			
		// break;
		// }
		if (system_arguments[0].contentEquals("daemon")) {
			development();
		} else if (system_arguments[0].contentEquals("text-ui")) {
			new TextUI();
		} else {

		}
		System.out.print("\n");
	}

	public static void main(String args[]) {
		new grana(args);
	}

	private void development() {
		System.out.print("In development");
	}

}
