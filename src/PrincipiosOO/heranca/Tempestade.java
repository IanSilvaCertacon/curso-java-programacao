package PrincipiosOO.heranca;

public class Tempestade extends SuperHeroi {
    public Tempestade(String clothe, String[] superPower){
        super(clothe, superPower);
    }

    @Override
    public void usarSuperPower(int index) {
        System.out.println(superPower[index]);
    }
}
