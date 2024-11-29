package curso.java.fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1 = salario.next().replace(",", ".");
        double numero1 = Double.parseDouble(salario1);

        System.out.print("Digite o segundo salário: ");
        String salario2 = salario.next().replace(",", ".");
        double numero2 = Double.parseDouble(salario2);

        System.out.print("Digite o terceiro salário: ");
        String salario3 = salario.next().replace(",", ".");
        double numero3 = Double.parseDouble(salario3);

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média dos salários é: " + media);

        salario.close();
    }
}
