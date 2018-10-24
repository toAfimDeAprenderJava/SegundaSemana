package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {
	public static void main(String[] args) {

        int intervalo = 100;

        System.out.println("Quais números de 0 à 100 são primos? ");
        System.out.println("------------------------------------ ");
        
        for (int i = 2; i < intervalo; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i + " é Primo!");

            }
        }

    }

}