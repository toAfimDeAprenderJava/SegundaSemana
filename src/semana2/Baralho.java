package semana2;

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
		
		int numeroCartas[] = {1,2,3,4,5,6,7,8,9,10};
		
		String naipesCartas[] = {"Copas","Ouros","Espadas","Paus"};
		
		for (String naipe : naipesCartas) {
		    for (int numero : numeroCartas) {
		        System.out.printf("%d de %s.%n", numero, naipe);
		    }
		}
}
}