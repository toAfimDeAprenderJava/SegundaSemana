package semana2;;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * �s de Ouros
 * �s de Espadas
 * �s de Copas
 * �s de Paus
 * Dois de Ouros
 * ...
 * 
 */
public class Baralho {
	public static void main(String[] args) {
		String[] cartas = {"�s", "Dois", "Tr�s", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
		String[] naipes = {"de Ouros", "de Espadas", "de Copas", "de Paus"};
		
		int flag = 0;
		
		for (String c: cartas)
		do {
			for (String s: naipes) {
				System.out.println(c + " " + s);
				flag++;
			}
		}while (flag<=2);
		}
	}

