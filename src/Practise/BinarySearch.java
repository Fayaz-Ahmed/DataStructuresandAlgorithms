package Practise;

import java.util.Arrays;

/**
 * @author Fayaz Ahmed
 */
class Practise {
    public static void main(String[] args) {

        Solution3 s1 = new Solution3();
        String s = "Let's take LeetCode contest";
        s1.reverseWords(s);
        System.out.println(s);
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
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
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

//How to reverse a String in java using recursion
class Solution3 {
    public String reverseWords(String s) {
        //split method splits a string into an array of substrings based on a specified delimiter.
        // In this case, s.split(" ") splits the input string s into an array of substrings based on spaces " ".
        // The result of this split is assigned to the words array.
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}