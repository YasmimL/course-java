package curso.java.arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int numNotas = scanner.nextInt();

        double[] notas = new double[numNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for(double nota: notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("A média do aluno é " + media + "!");

        scanner.close();
    }
}
