package excecoes;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {
    public static void main(String[] args) throws Exception {
        getNomes();
        //dividir(1,0);
        dividirNovo(1,0);
    }

    private static int dividir(int i, int j) throws Exception{
        if(j == 0)
            throw new Exception("Não é possível dividir por zero.");
            
        return i / j;
    }

    private static int dividirNovo(int i, int j) throws Exception{
        if(j == 0)
            throw new IllegalArgumentException("Não é possível dividir por zero.");
            
        return i / j;
    }

    public static void getNomes() {

        /*List<String> nomes = new ArrayList<>();
        nomes.add("Giuliana");

        System.out.println(nomes.get(0));
        */

        try{
            //System.out.println(nomes.get(1));
            int resultado = 10 / 0;

        } catch(IndexOutOfBoundsException e){ //quando sua o Exception ele é muito geral portanto, não é recomendavel já que todos os erros serao Exceptions
            //e.printStackTrace();
            System.out.println("O índice informado não é valido.");

        } catch(ArithmeticException e){
            System.out.println("Operação aritimética inválida.");

       }
    }
}
