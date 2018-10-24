package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i ++) {
			int counter = 0 ;
			for (int k = 1; k <= i; k++) {
				if(i % k == 0) ++counter ;
			}
			if (counter == 2) {
				System.out.println("o Numero: " + i + " � primo");
			}
		}
	
	}
}
