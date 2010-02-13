package br.org.auxiliar.grana.ui.text;

import br.org.auxiliar.grana.core.patterns.brazil.financial.Investiments;

public class TextUI {
	private int option;
	private Investiments i = null;

	private void SelectedOption() {
		switch (option) {
		case 1:
			i = new Investiments();
		}
	}

	private void TextUI() {
		System.out.print("Grana system - Simple UI Interface\n");
		System.out.print("Option:\n");
		principal_menu();

		System.out.print("Select: ");
		System.out.print(option);
		SelectedOption();
	}

	private void principal_menu() {
		System.out.print("1 => Investments\n\n");
	}
}
