package homework_nr_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        ArrayList<String> thingsToDo = new ArrayList<>();
        thingsToDo.add("Wash the dishes");
        thingsToDo.add("Make the bed");
        thingsToDo.add("Buy some vegetables");
        thingsToDo.add("Make the homework");
        thingsToDo.add("Repair the stairs");
        thingsToDo.add("Make the bed");
        thingsToDo.add("Wash the dishes");
        printThingsToDo(thingsToDo);


        HashSet<String> uniqueElements = new HashSet<>();
        printUniqueElements(uniqueElements, thingsToDo);


        HashMap<String, String> EngRomDictionary = new HashMap<>();

        EngRomDictionary.put("Desk", "Masa");
        EngRomDictionary.put("Foot", "Picior");
        EngRomDictionary.put("Icecream","Inghetata");
        EngRomDictionary.put("Eyes","Ochi");
        EngRomDictionary.put("Ice","Gheata");
        EngRomDictionary.put("Flower","Flori");
        EngRomDictionary.put("Sun","Soare");
        EngRomDictionary.put("Knife","Cutit");
        EngRomDictionary.put("Fork","Furculita");
        EngRomDictionary.put("Spoon","Lingura");

        System.out.println(EngRomDictionary);


    }
//    Создайте метод, который будет возвращать список вещей
//    (ArrayList<String>),gкоторые вам нужно сделать сегодня.
    public static void printThingsToDo (ArrayList<String> thingsToDo){
        for(String element: thingsToDo){
            System.out.println(element);
        }
    }


//    Определите метод, который будет принимать список значений String в качестве
//    аргумента и возвращать набор уникальных значений. Список, полученный
//    в качестве аргумента, может содержать повторяющиеся значения.
    public static void printUniqueElements(HashSet<String> uniqueElements, ArrayList<String> thingsToDo){
        System.out.println("---------");
        for(String element:thingsToDo){
            uniqueElements.add(element);
        }
        System.out.println("The unique elements are:" + uniqueElements);
    }

}
