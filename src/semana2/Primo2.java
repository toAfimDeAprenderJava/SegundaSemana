package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo2 {
	public static void main(String[] args) {
		int isPrime;
        for (int x = 1; x <= 100; x++) {
            isPrime = 0;

            for (int j = 2; j <= x / 2; j++) {

                if (x % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0)
                System.out.print(x + " ");
			}
	}
}
