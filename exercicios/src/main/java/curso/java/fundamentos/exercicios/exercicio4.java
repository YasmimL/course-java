package curso.java.fundamentos.exercicios;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double num = scanner.nextDouble();

        double numQuadrado = Math.pow(num, 2);
        double numCubo = Math.pow(num, 3);

        System.out.println(num + "² = " + numQuadrado);
        System.out.println(num + "³ = " + numCubo);

        scanner.close();
    }
}
