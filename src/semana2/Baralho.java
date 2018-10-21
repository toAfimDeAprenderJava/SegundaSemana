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
		String cartas = "As de " ;
		String cartas1 = "Dois de " ;
		String  naipesCartas = "Ouros Espadas Copas Paus Ouros" ;
		String [] vect = naipesCartas.split(" ");
	
		System.out.println(cartas  + vect[0]);
		System.out.println(cartas  + vect[1]);
		System.out.println(cartas  + vect[2]);
		System.out.println(cartas  + vect[3]);
		System.out.println(cartas1  + vect[4]);
	}
}
