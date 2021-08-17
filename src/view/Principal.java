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


/*
 
1 - A condição de parada é quando o a variavel trocar chegar é igual a 0;
 
2 - Para conseguir a string invertida apontamos primeiro para o final da string com o substring, e 
vamos pegando os intervalos afim de obter o cada caracter que vai aparecer invertido no final da pilha.  
Retornamos um caracter nulo porque se colocar 0 apesar de parar ele repete a primeira letra na inversão. 

*/