package semana2;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo:
 * 
 * 
 * ...
 * 
 */
public class Baralho {
	public static void main(String[] args) {

		//Declaracao das variaveis
		String[] naipes = { "Ouros", "Paus", "Espadas", "Copas" };
		String[] numeros = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete",
				"Dama", "Rei" };
		//iteracao vetores
		int i, j;
		
		//For percorrendo vetor de Naipes
		for (j = 0; j <= 3; j++) {
		//For percorrendo vetor de numeros	
		for (i = 0; i <= 12; i++) {

				System.out.println(numeros[i] + " de " + naipes[j]);
			}

		}

	}
}
