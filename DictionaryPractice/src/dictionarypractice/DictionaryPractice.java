package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<>();

        // Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");

        // Retrieve things from our dictionay
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        // Print out all keys
        System.out.println(englSpanDictionary.keySet());

        // Print out all values of dictionary
        System.out.println(englSpanDictionary.values());

        // print out size
        System.out.println("The size of our Dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<>();

        // Put some stuff in dictonay
        shoppingList.put("Man", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreos", false);
        shoppingList.put("Eggs", true);
        shoppingList.put("Sugar", false);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));

        // Key-value Pairs Print Out
        System.out.println(shoppingList.toString());

        // Is Empty?
        System.out.println(shoppingList.isEmpty());
        // Remove things
        shoppingList.remove("Eggs");
        
        // Replace values for certain key
        shoppingList.replace("Man", Boolean.FALSE);
        
        // Key-value Pairs Print Out
        System.out.println(shoppingList.toString());

        // Clear our dictionay
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        
         // Is Empty?
        System.out.println(shoppingList.isEmpty());

    }

}
