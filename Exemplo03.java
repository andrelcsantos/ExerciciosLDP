package school.sptech;

public class Exemplo03 {
    public static void main(String[] args){

        String nomeA = new String("André");
        String nomeB = new String("André");

        if(nomeA.equals(nomeB)) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }

        String nomeBanco = "André";
        String nomeProcurado = "andré";

        if(nomeBanco.equalsIgnoreCase(nomeProcurado)){
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}
