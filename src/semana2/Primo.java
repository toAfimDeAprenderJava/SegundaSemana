package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int intervalo = 101;

		for (i = 1; i < intervalo; i++) {
			boolean ehPrimo = true;
			for (j = 1; j <= i; j++) {
				if (((i % j) == 0) && (j != i)) {
					ehPrimo = false;
					break;
				}
			}

			if (ehPrimo) {
				System.out.println(i + " é um número primo");
			} else {
				System.out.println(i + " não é um número primo");
			}
		}

	}
}
