package semana2;

/**
 * Crie um programa que imprima todos os nÃºmeros
 * primos de 1 Ã  100
 */
public class Primo {
	public static void main(String[] args) {
		
// VERIFICA NÚMEROS PRIMOS 
		
		out: for (int I=2; I<=100; I++) 
        {	
for (int N=2; N<= Math.sqrt(I); N++) 
{ 
                if (I % N == 0) continue out;
}
            System.out.println ("O número: " +I+ " é primo");
        }
	}
	
}

