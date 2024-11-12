package OriObj;

import java.util.Arrays;

public class ArraysNotasestudo {
    public static void main(String[] args) {
        int[] idades = {5, 10, 14, 18};

        //System.out.println(idades[0]);
        //System.out.println(idades[1]);

        for (int idade : idades) {
            //System.out.println(idade);
        }

        //System.out.println(Arrays.toString(idades));

        Gato[] gatos = {new Gato("Leia"), new Gato("Rey")};

        System.out.println(gatos);
        System.out.println(Arrays.toString(gatos));
    }
}
