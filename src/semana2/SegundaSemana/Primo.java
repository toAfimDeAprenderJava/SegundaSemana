package SegundaSemana;

/**
 * Crie um programa que imprima todos os números
 * primos de 1 à 100
 */
public class Primo {
    public static void main(String[] args) {
        int i, j, divisores;

        for (i = 1; i <= 100; i++) {

            divisores =  0;

            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println(i);
            }
        }

    }

}

