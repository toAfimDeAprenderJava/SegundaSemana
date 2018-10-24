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


		String[] naipes = {"Ouros", "Paus", "Espadas", "Copas"};
		String[] numeros = {"As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete",
				"Dama", "Rei"};

		int a, b;

		for (b = 0; b <= 3; b++) {

			for (a = 0; a <= 12; a++) {

				System.out.println(numeros[a] + " de " + naipes[b]);
			}

		}
	}
}
