package PrincipiosOO.heranca;

import java.util.Arrays;

public class HomemDeFerro extends SuperHeroi implements Avenger{

    public HomemDeFerro(String clothe, String[] superPower){
        super(clothe, superPower);
        System.out.println("Homem de ferro! ");
    }

    public void userSuperPower(int index){
        System.out.println(Arrays.toString(superPower));
        System.out.println("Falar com Jarvis");
        //super.usarSuperPower((index));
    }

    @Override
    public void usarSuperPower(int index) {
      
    }

    @Override
    public boolean isLeader() {
        return true;
    }
    
}
