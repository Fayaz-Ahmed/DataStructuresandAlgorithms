package Practise;

import java.util.Arrays;

/**
 * @author Fayaz Ahmed
 */
class Practise {
    public static void main(String[] args) {
//        BinarySearch b = new BinarySearch();
        Solution s = new Solution();
        int nums[]={1,2,3,4};
        int target =7;
        s.searchInsert(nums,target);
        System.out.println(nums);
    }

}

//public class BinarySearch {
//    private static int search(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (target == nums[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//}

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