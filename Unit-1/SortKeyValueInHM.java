import java.util.*;

public class SortKeyValueInHM {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 1, 1, 0, 0, 0, 0 };

        int max = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int key : arr){
        hm.put(key , hm.getOrDefault(key, 0)+1); 
        
        }
      
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            
            if(e.getValue() > max){
                max = e.getValue();
            
            }  
            System.out.println(e.getKey());  
        }
   
        
    }
}
