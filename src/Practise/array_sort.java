package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class array_sort {
   public static void main(String[] args) {
       /* int x[] = {3, 1, 5, 8, 2, 4};
        Arrays.sort(x);

        System.out.println("Ascending order :");
        for(int i=0;i<=x.length;i++) {
            System.out.println(x[i]+",");
        }*/
       int[] array = {1, 2, 3, 2, 3, 1, 4};
       Map<Integer, Integer> frequencyMap = new HashMap<>();

       for (int i : array) {
           int count = frequencyMap.getOrDefault(i, 0);
           frequencyMap.put(i, count + 1);
       }

       System.out.println(frequencyMap);
    }
}
