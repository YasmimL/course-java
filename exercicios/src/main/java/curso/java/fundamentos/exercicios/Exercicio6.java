package curso.java.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Equação: ax² + bx + c = 0");

        System.out.print("\nDigite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("\nDigite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("\nDigite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a  * c);
        System.out.println("O valor do delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

        scanner.close();
    }
}
