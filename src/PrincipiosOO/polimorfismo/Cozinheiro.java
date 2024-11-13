package PrincipiosOO.polimorfismo;

public class Cozinheiro implements Worker {
    @Override
    public void work() {
        System.out.println("Fazer comidas ou refeições");
    }

    public void temperarComida(){
        System.out.println("Temperar comida");
    }
}
