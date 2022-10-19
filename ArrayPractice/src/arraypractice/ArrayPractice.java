package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }

    public static void main(String[] args) {
        // index: 0   1  2   3  
        // array:[10, 8, 5, 10] --> lengeth 4

        // index:   0       1       2
        // array: ["bob', "sally", "max"] --> length 3
        
        // Ramdom Objects from Array
        // Math.abs(rand.nextInt) % lengeth;
        int[] intArray1;
        int[] intArray2 = new int[4];
        printArray(intArray2);
        System.out.println();

        int[] intArray3 = {5, 2, 9, 1, 3};
        String[] shoppingList = {"banana", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        // prints out array
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        printArray(intArray2);
        System.out.println();
        printArray(intArray3);
        System.out.println();
        
        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 2));

        //Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        System.out.println();

        // Print string array
        printArray(shoppingList);
        System.out.println();
        
        System.out.println("Special For Loop:");
        // Specail for loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
        
        
        

    }

}
