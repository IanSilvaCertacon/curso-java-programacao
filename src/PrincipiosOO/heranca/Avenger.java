package PrincipiosOO.heranca;

public interface Avenger {
    
    boolean isLeader();

    default void enterBuilding() {
        System.out.println("Entering building...");
    }

}
