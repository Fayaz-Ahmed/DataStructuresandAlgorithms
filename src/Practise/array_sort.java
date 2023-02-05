package Practise;

import java.util.Arrays;

public class array_sort {
    public static void main(String[] args) {
        int x[] = {3, 1, 5, 8, 2, 4};
        Arrays.sort(x);

        System.out.println("Ascending order :");
        for(int i=0;i<=x.length;i++) {
            System.out.println(x[i]+",");
        }
    }
}
