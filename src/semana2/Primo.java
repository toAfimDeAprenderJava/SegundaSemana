package semana2;

/**
 * Crie um programa que imprima todos os n�meros
 * primos de 1 � 100
 */
public class Primo {
	public static void main(String[] args) {		
		for (int x=1; x<=100; x++) {
			
				if (Math.pow(2,x)%x == 2){
					System.out.print(x + " ");
				}		
			}
		}
	}
