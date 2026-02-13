package school.sptech;

public class Exemplo05 {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 5;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Subtração: " + (numero01 - numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Resto: " + (numero01 % numero02));
        System.out.println("Pontenciação: " + (Math.pow(numero01, numero02)));


        Double numeroA = 5.0;
        Integer numeroB = 10;

        // Double.valueOf()
        System.out.println("Divisão: " + (numeroA / numeroB));
    }
}
