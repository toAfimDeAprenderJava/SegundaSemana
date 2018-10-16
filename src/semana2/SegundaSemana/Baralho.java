package SegundaSemana;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * Ás de Ouros
 * Ás de Espadas
 * Ás de Copas
 * Ás de Paus
 * Dois de Ouros
 * ...
 * 
 */
public class Baralho {
	public static void main(String[] args) {

		String naipes[] = {"ouro", "espada", "copas", "paus"};
		String numerosBaralho[] = {"Às", "Dois", "Três", "Quatro", "Cinco", "Seis",
				"Sete", "Oito", "Nove", "Dez", "Valete", "Rainha", "Rei"};

		int i, j;

		for (i = 0; i < numerosBaralho.length; i++) {
			for (j = 0; j < naipes.length; j++) {
				System.out.println(numerosBaralho[i] + " de " + naipes[j]) ;

			}
		}
	}
}
