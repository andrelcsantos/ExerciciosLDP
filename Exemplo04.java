package school.sptech;

public class Exemplo04 {

    public static void main(String[] args){

        for(Integer i = 0; i <= 10; i++) {
            System.out.println("Número da vez: " + i);
        }
        Integer contador = 0;
        while(contador <= 10) {
            System.out.println("Contador da vez: " + contador);
            contador++;
        }

        Integer contador2 = 0;
        do {
            System.out.println("Contador 2 da vez: " + contador2);
            contador2++;
        } while (contador2 <= 10);
    }
}
