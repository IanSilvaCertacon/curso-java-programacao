package PrincipiosOO.empresa;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ligarCarro();
        carro.acelerar();
        carro.frear();
        carro.setVolante("skdaskfkas");

        System.out.println(carro.getVolante());
    }
}
