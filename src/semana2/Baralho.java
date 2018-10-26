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
	// Cartas do Baralho
		
String vetor[] = {"As","2","3","4","5","6","7","8","9","10","J-Valéte","Q-Dama","K-Rei"};
		String nipe [] = {"Copas","Ouro","Espadas","Paus"}; 
int i=0;
int c=0;
for (i=0; i<vetor.length; i++)
	for (c=0; c<nipe.length; c++)
		System.out.println (vetor[i]+" de "+nipe[c]);
	}
	
}