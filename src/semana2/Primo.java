package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 * 
 */
public class Primo {
	public static void main(String[] args) {
	for (int numeroAVerificar=1; numeroAVerificar<=100; numeroAVerificar++) {
		ePrimo(numeroAVerificar);
		System.out.println(ePrimo);
	}
	}

	public static int ePrimo(int numeroAVerificar) {
		int numeroPrimo=1;
	int verificaUmEmUm=1;
		
		while (verificaUmEmUm<=numeroAVerificar) {
			if(numeroPrimo%numeroAVerificar==0) return;
			else return numeroPrimo;
		}
	}
}