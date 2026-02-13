package school.sptech;

public class Exemplo02 {
    public static void main(String[] args){
        Boolean moto = true;

        if(moto) {
            System.out.println("Tem moto");
        }

        Integer idade = 10;

        if(idade < 16) {
            System.out.println("Não pode votar!");
        } else if (idade < 18){
            System.out.println("Pode votar, mas não pode dirigir");
        } else {
            System.out.println("Pode votar e pode dirigir");
        }

        String mensagem = idade > 18 ? "Pode dirigir" : "Não pode dirigir";
        System.out.println(mensagem);
    }
}
