package OriObj;

public class Casa {
    public Boolean inteligente;
    public String nome;
    
    public Casa(){
        
    }

    public Casa(boolean inteligente){
        this.inteligente = inteligente;
    }

    public void acenderLuz(int comodo){
        if (inteligente)
        System.out.println("Comando de voz");
        else
        System.out.println("Pressionar interruptor");
    }
}
