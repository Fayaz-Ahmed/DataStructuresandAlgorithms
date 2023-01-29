package Practise;
/**
 * @author Fayaz Ahmed
 */
class Practise {
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
    }

}

public class BinarySearch {
    private static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }

}