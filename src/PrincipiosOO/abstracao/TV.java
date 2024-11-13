package PrincipiosOO.abstracao;

public class TV {
    private boolean on;
    private int volume;
    private int channel;

    public void turnOnOff(){
        this.on = !this.on;
        System.out.println(
            "A TV está " + (on ? "Ligada" : "Desligada")
        );
    }

    public void increaseVolume(){
        this.volume++;
        System.out.println("Volume aumentado para " + this.volume);
    }

    public void decreaseVolume(){
        this. volume--;
        System.out.println("Volume diminuido para " + this.volume);
    }

    public void changeChannel(int newChannel){
        this.channel = newChannel;
        System.out.println("Canal trocado para " + this.channel);
    }
}
