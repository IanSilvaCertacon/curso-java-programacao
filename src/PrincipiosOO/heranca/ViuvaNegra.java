package PrincipiosOO.heranca;

public class ViuvaNegra extends SuperHeroi implements Avenger {
    public ViuvaNegra(String clothe, String[] superPower){
        super(clothe, superPower);
    }

    @Override
    public void usarSuperPower(int index) {
        System.out.println(superPower[index]);
    }

    @Override
    public boolean isLeader() {
        return false;
    }
}
