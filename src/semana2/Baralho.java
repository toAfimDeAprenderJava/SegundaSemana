package semana2;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * Ã�s de Ouros
 * Ã�s de Espadas
 * Ã�s de Copas
 * Ã�s de Paus
 * Dois de Ouros
 * ...
 * 
 */
public class Baralho {
	public static void main(String[] args) {
	String[] numeros={"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Rainha", "Rei"};
	String[] figuras={"ouros", "espadas", "copas", "paus"};
	for(int numeroCorrente=0; numeroCorrente <=12; numeroCorrente++) {
		for(int figuraCorrente=0; figuraCorrente <=3; figuraCorrente++) {
			System.out.println(numeros[(numeroCorrente)] + " de " + figuras[(figuraCorrente)]);
	}
	}
}
}