package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.PilhaString.Pilha;
import controller.PalindromosController;

public class Main {

	public static void main(String[] args) {
		try {
			PalindromosController p = new PalindromosController();
			Pilha palindromo = new Pilha();
			
			String palavra;
			palavra = JOptionPane.showInputDialog("Digite uma palavra");
			
			p.exibeResultado(palindromo, palavra);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
