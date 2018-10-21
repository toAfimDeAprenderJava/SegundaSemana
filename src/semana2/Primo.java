package semana2;

import java.util.Scanner;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Qual o limite? ");
		int limite = sc.nextInt();

		for (int i = 1; i <= limite; i++) {

			int counter = 0;

			for (int k = 1; k <= i; k++) {
				if (i % k == 0) counter++;
			}
			if (counter == 2) {
				System.out.println("O numero: " + i + " é primo");
			}
		}
	
	}
}
