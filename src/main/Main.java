package main;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		
		int resposta = JOptionPane.showConfirmDialog(null, "Gostaria de calcular a média do aluno?");

		if (resposta == 0) {
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 :"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 :"));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 :"));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4 :"));

			double media = (nota1 + nota2 + nota3 + nota4) / 4;

			if (media > 5) {
				if (media >= 7) {
					JOptionPane.showMessageDialog(null, "Aprovado com Sucesso, média : " + media);

				} else {
					JOptionPane.showMessageDialog(null, "Em Recuperação, média : " + media);

				}
			} else {
				JOptionPane.showMessageDialog(null, "Reprovado, média : " + media);
			}
		}
		
		
		
	}

}
