package OriObj;

public class Matematica {
    public static final Double LIMITE_OPERACAO = 100.0; // torna a variavel imutavel//
    public static Double limite;

    static{
        limite = 100.0;
    }
    
    public static final Double sum(double n1, double n2){
        double sum = n1 + n2;
        if (sum > limite)
        return limite;
        else 
        return sum;
    }

    public Double somaNaoEstatica(double n1, double n2){
        double soma = n1 + n2;
        if(soma > limite)
        return limite;
        else
        return soma;
    }
}
