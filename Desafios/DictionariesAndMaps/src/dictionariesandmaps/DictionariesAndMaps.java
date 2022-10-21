
package dictionariesandmaps;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;


public class DictionariesAndMaps {
    
    public static void main(String[] args) {
               
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Dictionary<String, Integer> contacts
            = new Hashtable<>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contacts.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            contacts.get(s);
            
            if(contacts.get(s) != null) {
                System.out.println(s + "=" + contacts.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
    
}
