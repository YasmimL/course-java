package curso.java.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = tempCelsius * 1.8 + 32;
        System.out.print("A temperatura em Fahrenheit: " + tempFahrenheit + "°F");

        scanner.close();
    }
}
