package semana2;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {
	public static void main(String[] args) {
		
// VERIFICA N�MEROS PRIMOS 
		
		out: for (int I=2; I<=100; I++) 
        {	
for (int N=2; N<= Math.sqrt(I); N++) 
{ 
                if (I % N == 0) continue out;
}
            System.out.println ("O n�mero: " +I+ " � primo");
        }
	}
	
}

