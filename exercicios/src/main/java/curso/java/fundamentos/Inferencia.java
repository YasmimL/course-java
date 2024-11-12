package curso.java.fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        // a = "...";

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5;

        double d;
        d = 123.65;
        System.out.println(d);

        // var e; --> com var é preciso declarar e inicializar, para que o Java faça a inferência do tipo
    }
}
