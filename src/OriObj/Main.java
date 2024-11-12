package OriObj;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(false);
        Casa casa2 = new Casa(true);
        Casa casa3 = new Casa();

        //casa3.inteligente = false;

        casa1.acenderLuz(0);
        casa2.acenderLuz(0);
        casa3.acenderLuz(0);

        System.out.println(casa3.nome);
    }
}
