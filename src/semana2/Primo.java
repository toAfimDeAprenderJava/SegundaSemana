package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 * 
 */
public class Primo {
	public static void main(String[] args) {
		int primoDivisor=2;
	for (int numeroPrimo=1; numeroPrimo<=100; numeroPrimo++) {
		while((numeroPrimo%numeroPrimo==0) && (numeroPrimo%1==0) && (numeroPrimo%primoDivisor!=0)) {
			System.out.println(numeroPrimo);
			primoDivisor=numeroPrimo;
		}
	}
	}
}