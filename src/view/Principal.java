package view;


import javax.swing.JOptionPane;

import controller.StringController;

public class Principal {

	public static void main(String[] args) {
		StringController ent = new StringController();
	String string = JOptionPane.showInputDialog(null, "Insira uma Frase");
		
		String resultado = ent.troca(string, string.length());
		System.out.println(resultado);
	}
	
}