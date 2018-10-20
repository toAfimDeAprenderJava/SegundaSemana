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

		String[] naipes = { "Ouros", "Paus", "Espadas", "Copas" };
		String[] numeros = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete",
				"Dama", "Rei" };

		int i, j;
		
		for (j = 0; j <= 3; j++) {

		for (i = 0; i <= 12; i++) {

				System.out.println(numeros[i] + " de " + naipes[j]);
			}

		}

	}
}
