package PrincipiosOO.heranca;

public class HomemAranha extends SuperHeroi implements Avenger {

    public HomemAranha(String clothe, String[] superPower){
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
