package Practise;

import java.util.Arrays;

/**
 * @author Fayaz Ahmed
 */
class Practise {
    public static void main(String[] args) {

Solution1 s1 = new Solution1();
        char[] sq = {'h', 'e', 'l', 'l', 'o'};
        s1.reverseString(sq);
        System.out.println(sq);
    }

}

public class BinarySearch {
    private static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}

// Reverse String
class Solution1 {
    public void reverseString(char[] s) {
        int n=s.length;
        for (int i = 0; i < n / 2; i++){
            char temp = s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
    }
}