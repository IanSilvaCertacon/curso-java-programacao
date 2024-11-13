package PrincipiosOO.polimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println(sum(1, 1));
        System.out.println(sum(2.0, 2.0));
    }

    static int sum(int a, int b){
        return a + b;
    }
    
    static double sum(double a, double b){
        return a + b;
    }
    
}
