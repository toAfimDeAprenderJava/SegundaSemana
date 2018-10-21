package semana2;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * Ás de Ouros
 * Ás de Espadas
 * Ás de Copas
 * Ás de Paus
 * Dois de Ouros
 * ...
 * 
 */
public class Baralho {
	public static void main(String[] args) {
		String naipes[] =  {"Ouros", "Espadas","Copas", "Paus"};
		String cartas[] = {"Ás","Dois","Tres","Quatro","Cinco", "Seis", "Sete", "Oito", "Nove", "Valete", "Dama", "Rei"};

		for (int i = 0; i < cartas.length; i++)
		{
			for  (int j = 0; j < naipes.length; j++){
				System.out.println(cartas[i] + " de "+naipes[j]);
			}
		}
	}
}
