package semana2;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * Ã�s de Ouros
 * Ã�s de Espadas
 * Ã�s de Copas
 * Ã�s de Paus
 * Dois de Ouros
 * ...
 * 
 */
public class Baralho {
	public static void main(String[] args) {
		
		String v[] = {"As","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		String nipe[] ={"ouro","copas","paus","espadas"};
		for(int d=0; d<v.length; d++)
			for(int e=0; e<nipe.length; e++)
			System.out.println(v[d]+ "de" +nipe[e]);
	}
	}

