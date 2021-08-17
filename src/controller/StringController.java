package controller;


public class StringController {
	public  StringController(){
	super();
	}
	
	public String troca(String string, int posicao) {
	if(posicao == 0) {
		return "";
		
	} else {
		return string.substring(posicao -1, posicao) + troca(string, posicao -1);
		
	}
	
	
	
	
	}
	
	
	
}
