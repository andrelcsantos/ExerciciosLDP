package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {
    public static void main(String[] args) {

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(5,10);
        System.out.println(numeroAleatorio);

        Double numeroQuebradoAleatoio = ThreadLocalRandom.current().nextDouble(10.2);
        System.out.println(numeroQuebradoAleatoio);
    }
}
