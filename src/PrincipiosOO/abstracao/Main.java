package PrincipiosOO.abstracao;

public class Main {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.turnOnOff();
        myTV.increaseVolume();
        myTV.decreaseVolume();
        myTV.changeChannel(1);
    }
}
