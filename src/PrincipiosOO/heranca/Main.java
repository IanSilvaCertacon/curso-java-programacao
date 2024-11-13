package PrincipiosOO.heranca;

public class Main {
    public static void main(String[] args) {
        
       SuperHeroi[] superHerois = {
        new HomemAranha("Roupa vermelha com teias", new String[] { "Lançar Teia"}),
        new HomemDeFerro("Roupa vermelha super resistente", new String[] { "Usar traje de guerra"}),
        new ViuvaNegra("Roupa Preta", new String[] { "Espiã"}),
        //new SuperHeroi("Minha roupa", new String[]{"Contar piadas"})
       };

       System.out.println(SuperHeroi.tendencia);

       Avenger avenger = new HomemAranha("Roupa vermelha com teias", new String[] { "Lançar Teia"});
       avenger.enterBuilding();

       validar(superHerois);

       for (SuperHeroi superHeroi : superHerois ){
        System.out.println(superHeroi.getClothe());
        superHeroi.usarSuperPower(0);
       }
        
    }
    static void validar (SuperHeroi[] superHerois){
        if(superHerois[0] instanceof HomemAranha){
            System.out.println("Lógica de validação do Homem Aranha...");
        }
    }
}
