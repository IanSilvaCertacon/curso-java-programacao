package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionsBasic {
    public static void main(String[] args) {
        //String[] names = new String[3];
        //String[] names = {"Giuliana", "Leia", "Rey"};
                                                                //pode usar List ao inves de ArrayList  

        ArrayList<String> namesArrayList = new ArrayList<>() {{
            add("1");
            add("2");
            add("3");
        }};

        /*namesArrayList.add("1");
        namesArrayList.add("2");
        namesArrayList.add("3");*/
        
        System.out.println(namesArrayList);

        //GET
        System.out.println(namesArrayList.get(0));
        System.out.println(namesArrayList.get(1));

        //INSERT/UPDATE
        namesArrayList.set(0, "3");
        namesArrayList.set(1, "2");
        namesArrayList.set(2, "1");
        namesArrayList.add("0");            //somente o add pode adicionar outros numeros
        System.out.println(namesArrayList);

        //DELETE
        /*namesArrayList.remove(1);
        namesArrayList.remove("3");
        System.out.println(namesArrayList);
        */

        //Sort
        Collections.sort(namesArrayList);
        System.out.println(namesArrayList);

        for(String name : namesArrayList){
            System.out.println(name);
        }

        Iterator<String> it = namesArrayList.iterator();    //percorrer elementos da lsita
        while(it.hasNext()){
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }

        List<String> listOfNames = List.of("Giuliana", "Leia", "Rey"); //transformar de um em um 
        System.out.println(listOfNames);

        String[] arrayNames = {"Giuliana", "Leia", "Rey"}; //transformar para lista
        List<String> listConverted = Arrays.asList(arrayNames);
        System.out.println(listConverted);

        String[] arrayConverted = listConverted.toArray(new String[0]); //passa tipo 0 so para saber o tipo, nesse caso "String"
        System.out.println("Array: " + Arrays.toString(arrayConverted));

        Map<String, String> mapOfUsers = new HashMap<>(){{
            put("giuliana", "Giuliana"); 
            put("leia", "Leia");
            put("rey", "Rey");
        }};
        
        /* 
        mapOfUsers.put("giuliana", "Giuliana"); //adicionar usuario
        mapOfUsers.put("leia", "Leia");
        mapOfUsers.put("rey", "Rey");
        */

        System.out.println(mapOfUsers);

        //GET
        System.out.println(mapOfUsers.get("giuliana"));
        System.out.println(mapOfUsers.get("rey"));

        //UPDATE
        mapOfUsers.put("giuliana", "Giuliana Bezerra");
        System.out.println(mapOfUsers);

        //REMOVE
        mapOfUsers.remove("giuliana");
        System.out.println(mapOfUsers);

        for(String values : mapOfUsers.values()){   //TRANSFORMA O MAPA EM COLLECTIONS
            System.out.println(values);
        }

        for(String keys : mapOfUsers.keySet()){   //TRANSFORMA O MAPA EM COLLECTIONS
            System.out.println(keys);
        }
    }
}
