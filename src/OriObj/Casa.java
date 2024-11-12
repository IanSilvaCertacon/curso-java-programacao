package OriObj;

public class Casa {
    boolean inteligente;
    String nome;
    
    public Casa(){
        
    }

    public Casa(boolean inteligente){
        this.inteligente = inteligente;
    }

    void acenderLuz(int comodo){
        if (inteligente)
        System.out.println("Comando de voz");
        else
        System.out.println("Pressionar interruptor");
    }
}
