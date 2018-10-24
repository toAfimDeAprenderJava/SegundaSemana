package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 * 
 */
public class Primo {

public static void main(String[] args) {
for(int numeroPrimo=2; numeroPrimo<=100; numeroPrimo++) {
	if(ePrimo(numeroPrimo)) System.out.println(numeroPrimo);
}
}

public static boolean ePrimo(int numeroPrimo) {
	for(int checaNumANum=2; checaNumANum<=numeroPrimo; checaNumANum++) {
		if((numeroPrimo%checaNumANum==0) && (checaNumANum!=numeroPrimo)) return false;
		if((numeroPrimo%checaNumANum==0) && (checaNumANum!=numeroPrimo) && (checaNumANum!=1)) return false;
		if((numeroPrimo%checaNumANum==0) && (checaNumANum!=numeroPrimo) && (numeroPrimo!=1)) return false;
		if((numeroPrimo%checaNumANum==0) && (checaNumANum==numeroPrimo)) return true;
	}
	return false; //Linha redundante, mas o interpretador desconfia que o for n�o ser� executado e nada seria retornado
}
}