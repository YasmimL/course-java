package curso.java.fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double temperaturaFahrenheit = 86;
        double temperaturaCelsius = (temperaturaFahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + temperaturaCelsius + "˚C.");

        temperaturaFahrenheit = 0;
        temperaturaCelsius = (temperaturaFahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + temperaturaCelsius + "˚C.");
    }
}
