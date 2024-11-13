package PrincipiosOO.heranca;

public abstract class SuperHeroi {
    protected String clothe;
    protected String[] superPower;

    public static final boolean tendencia = true;
    
    public SuperHeroi(String clothe, String[] superPower) {
        this.clothe = clothe;
        this.superPower = superPower;
    }

    public abstract void usarSuperPower(int index);
       // System.out.println("Usando super poder " + superPower[index]);
    

    public String getClothe() {
        return clothe;
    }
}