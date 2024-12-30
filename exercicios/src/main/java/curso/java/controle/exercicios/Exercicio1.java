package curso.java.controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    /**
     * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
     * 10 e é par;
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if(num >= 0 && num <= 10) {
            if(num % 2 == 0) {
                System.out.printf("O número %d está entre 0 e 10 e é par!", num);
            } else {
                System.out.printf("O número %d está entre 0 e 10 mas não é par!", num);
            }
        }

        scanner.close();
    }
}
