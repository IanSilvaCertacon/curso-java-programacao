package OriObj;

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

        Double soma = Matematica.sum(1.0, 1.0);
        Double somaNaoEstatica = new Matematica().somaNaoEstatica(1.0, 1.0);
        System.out.println(Matematica.limite);
        System.out.println(somaNaoEstatica);
        System.out.println(soma);

        System.out.println(Matematica.limite);
    }
}
