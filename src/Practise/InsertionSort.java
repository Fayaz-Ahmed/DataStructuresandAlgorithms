package Practise;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            if (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
            }
        }
    }
}


