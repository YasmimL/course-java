package curso.java.controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    /**
     * 4. Criar um programa que receba um número e diga se ele é um número primo.
     */

    public static void main(String[] args) {

        int contadorDeDivisores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um numero para verificar se é primo:");
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO numero " + num + " é primo.");
        } else {
            System.out.println("\nO numero " + num + " não é primo.");
        }

        scanner.close();
    }
}
