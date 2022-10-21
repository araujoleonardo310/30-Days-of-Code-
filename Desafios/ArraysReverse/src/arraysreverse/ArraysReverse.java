package arraysreverse;

import java.util.Arrays;
import java.util.List;

public class ArraysReverse {
    
    public static void main(String[] args) {
        
        List<Integer> arr = Arrays.asList(1,2,3,4);
        
        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
    
}
