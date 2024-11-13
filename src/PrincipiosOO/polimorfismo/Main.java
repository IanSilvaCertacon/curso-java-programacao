package PrincipiosOO.polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        Worker[] workers = {new Cozinheiro(), new Programador(), new Medico()};
    
        work(workers);
    }

    private static void work(Worker[] workers){
        for(Worker worker : workers){
            worker.work();
            if(worker instanceof Cozinheiro){
                ((Cozinheiro) worker).temperarComida();
            }
        }
    }
}
