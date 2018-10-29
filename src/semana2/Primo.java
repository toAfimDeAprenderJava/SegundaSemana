package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {
	public static void main(String[] args) { 	
       
		out: for (int x =2; x<=100; x++) {
			for (int y =2; y <= Math.sqrt(x); y++) {
					if (x % y == 0) continue out;
			}
					System.out.println(x + "� primo");
		}
	}
}

