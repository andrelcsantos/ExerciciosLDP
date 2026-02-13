package school.sptech;

public class Exemplo06 {
    public static void main(String[] args) {

        String nome = "André";
        Integer idade = 24;
        Double peso = 56.5;
        Float altura = 1.76f;
        Boolean temMoto = false;

        /*String mensagem = String.format(("Meu nome é %s, tenho %d anos " +
                "%f de altura e %f de peso"), nome, idade, altura, peso);
        System.out.println(mensagem); */

        String mensagem = ("Meu nome é %s, tendo %d anos " +
                "%.2f de altura e %.2f de peso").formatted(nome, idade, altura, peso);
        System.out.println(mensagem);

//        String texto = "Meu nome André\n" +
//                "Gosto de Java \n" +
//                "E é isso";
//        System.out.println(texto);


        String texto = """
                Testando o texto aqui
                foi?
                """;

        System.out.println(texto);

    }
}
