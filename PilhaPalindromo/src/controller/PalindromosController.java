package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.PilhaString.Pilha;

public class PalindromosController {

	public PalindromosController() { }
	
	private String inverteString(Pilha inverter, String palavra) throws Exception {
		String palavraInvertida = null;
		int i = 0;
		while(i < palavra.length()) {
			inverter.push(String.valueOf(palavra.charAt(i)));
			i++;
		}
		
		palavraInvertida = inverter.pop();
		while(!inverter.isEmpty()) {
			palavraInvertida += inverter.pop();
		}
		
		return palavraInvertida;
	}

	private boolean comparaPalavras(String palavra, String palavraInvertida) {
		if (palavra.equals(palavraInvertida))
			return true;
		
		return false;
	}
	
	public void exibeResultado(Pilha p, String palavra) throws Exception {
		String palavraInvertida = inverteString(p, palavra);
		boolean result = comparaPalavras(palavra, palavraInvertida);

		if (result)
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " é um palindromo ");
		else
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " não é um palindromo ");
	}
}
