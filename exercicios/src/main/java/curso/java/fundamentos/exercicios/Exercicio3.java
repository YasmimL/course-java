package curso.java.fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("O IMC é: " + df.format(imc));

        scanner.close();
    }
}
