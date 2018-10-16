package semana2;

/**
 * Crie um programa que imprima todos os nÃºmeros
 * primos de 1 Ã  100
 * 
 * Variáveis usadas:
 * numeroPrimo - Número que será checado, e impresso, caso seja primo. Inicializa-se com 1.
 * primoDivisor - Número primo que será utilizado na checagem se numeroPrimo é de fato um número primo. Inicializa-se com 2, e ao longo do código será substituido pelos próximos números primos.
 */
public class Primo {
	public static void main(String[] args) {
		int primoDivisor=1;
	for (int numeroPrimo=1; numeroPrimo<=100; numeroPrimo++) {
//		if(numeroPrimo%primoDivisor!=0) {
			System.out.println(numeroPrimo/primoDivisor);
//			System.out.println(numeroPrimo%primoDivisor);
			System.out.println(numeroPrimo);
			primoDivisor=numeroPrimo;
//		}
	}
	}
}