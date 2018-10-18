package semana2;

/**
 * Crie um programa que imprima todos os n√∫meros
 * primos de 1 √† 100
 * 
 */
public class Primo {

public static void main(String[] args) {

for(int numeroPrimo=1; numeroPrimo<=100; numeroPrimo++) {
	if(ePrimo(numeroPrimo)) System.out.println(numeroPrimo);
}
}

public static boolean ePrimo(int numeroPrimo) {
	for(int checaPrimoAPrimo=2; checaPrimoAPrimo<=numeroPrimo; checaPrimoAPrimo++) {
		if((numeroPrimo%checaPrimoAPrimo!=0) && (numeroPrimo/checaPrimoAPrimo<=numeroPrimo)) return true;
		return false;
	}
	return false; //Parece que tenho que acrescentar isso sen„o Java duvida que o for ser· executado e tem medo de n„o retornar nada
	}
}