package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 * 
 */
public class Primo {
	public static void main(String[] args) {
	for (int numeroPrimo=1; numeroPrimo<=100; numeroPrimo++) {
		while((numeroPrimo%1==0) && (numeroPrimo%numeroPrimo!=0)) {
			System.out.println(numeroPrimo);
		}
	}
	}
}