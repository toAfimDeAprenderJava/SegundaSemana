package semana2;

/**
 * Crie um programa que imprima todos os nÃºmeros
 * primos de 1 Ã  100
 */
public class Primo {
	public static void main(String[] args) {
		
		//Declaracao das variaveis
		int i, j;
		boolean flag = true; 
		
		System.out.println("Os números primos são:");
		
		//Verificacao dos numeros de 2 a 100
		for (i = 2; i <= 100; i++) {
			flag = true;
			for (j = 2; j < i; j++) {
			
				//Se um numero for divisivel por um numero que veio antes dele, além do 1, setamos a flag para false
				//e saimos do for interno
				if (i % j == 0) {
					
					flag = false;
					break;
				}
				
			}
			
			//Se um numero nao for divisivel por um numero que veio antes dele, ele e primo por isso a flag e true
			if (flag == true) {
				
				System.out.println(i);
				
			}
		
	
	}
}
}