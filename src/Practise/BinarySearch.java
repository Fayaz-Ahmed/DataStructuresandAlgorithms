package Practise;

import java.util.Arrays;

/**
 * @author Fayaz Ahmed
 */
class Practise {
    public static void main(String[] args) {

Solution2 s1 = new Solution2();
        int[] sq = {1,4,2,3};
        int n = sq.length;
        s1.findSecondMax(sq);
        System.out.println(sq[n-2]);
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

class Solution2 {
    public static int findSecondMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - 2];
    }
}