package curso.java.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = scanner.nextDouble();

        double tempCelsius = (tempFahrenheit - 32)  / 1.8;

        System.out.print("A temperatura em Celsius: " + tempCelsius + "°C");

        scanner.close();
    }
}
