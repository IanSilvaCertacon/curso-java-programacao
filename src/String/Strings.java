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
        idadeStr += " de Idade";

        System.out.println(idadeStr);
        System.out.println(idadeInt);


    }
}
