package OriObj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Casa casa1 = new Casa(false);
        Casa casa2 = new Casa(true);
        Casa casa3 = new Casa();

        //casa3.inteligente = false;

        casa1.acenderLuz(0);
        casa2.acenderLuz(0);
        casa3.acenderLuz(0);

        casa3.nome = "Sua casa";
        System.out.println(casa3.nome);*/

        /*Double soma = Matematica.sum(1.0, 1.0);
        Double somaNaoEstatica = new Matematica().somaNaoEstatica(1.0, 1.0);
        System.out.println(Matematica.limite);
        System.out.println(somaNaoEstatica);
        System.out.println(soma);

        System.out.println(Matematica.limite);
        */

        Usuario u1 = new Usuario();
        u1.username = "u1";

        Usuario u2 = new Usuario();
        u2.username = "u1";

        System.out.println(u1.equals(u2));
        System.out.println(u1);
        System.out.println(u2);

        System.out.println("String 1".equals("String 1"));
        Usuario[] array1 = {u1, u2};

        Usuario u3 = new Usuario();
        u3.username = "u1";

        Usuario u4 = new Usuario();
        u3.username = "u1";
        
        Usuario[] array2 = {u3, u4};

        System.out.println();
        System.out.println(Arrays.equals(array1, array2));
        

    }
}
