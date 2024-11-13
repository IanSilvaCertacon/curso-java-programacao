package String;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String texto1 = "Texto customizado";
        String texto2 = "Texto customizado";
        String outroTexto = new String("Texto customizado");
        //System.out.println(texto1);
        //System.out.println(outroTexto);

        //System.out.println(texto1 == texto2);

        char[] texto1Array = texto1.toCharArray();
        for(char letra : texto1Array){
            if(letra =='y'){
                System.out.println("Encontrou o y!");
            }
        }

        System.out.println(texto1.charAt(0));
        System.out.println(texto1.charAt(texto1.length() - 1));

        System.out.println(texto1.toLowerCase());
        System.out.println(texto1.toUpperCase());
        System.out.println(texto1);

        String[] palavras = texto1.split(" ");
        System.out.println(Arrays.toString(palavras));

        String nomes = "Giuliana, Leia, Rey";
        System.out.println(Arrays.toString(nomes.split(", ")));

        String idade = "20";
        Integer idadeInt = Integer.valueOf(idade);
        String idadeStr = String.valueOf(idadeInt);
        idadeStr += " anos de Idade";

        System.out.println(idadeStr);
        System.out.println(idadeInt);

        String concatenacao = "Ela " + " é " + "muito" + " comum.";

        StringBuilder builder = new StringBuilder();
        builder.append("Ela ");
        builder.append("é ");
        builder.append("muito ");
        builder.append("comum.");

        System.out.println(concatenacao);
        System.out.println(builder.toString());

        String nome = "Ian";
        String username = "ian";
        String email = "ian@gmail.com";

        //String textoFormatado = "Olá eu sou o " + nome + ", meu usuário é " + username + ", e meu email é o " + email;
        String textoFormatado = """
            Olá eu sou o %s, meu usuário é %s, e meu email é o %s
            Eu posso ter
            multiplas linhas
            """
        .formatted(nome, username, email);

        System.out.println(textoFormatado);

    }
}
