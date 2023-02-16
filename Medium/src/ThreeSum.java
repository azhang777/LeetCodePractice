import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //twoSum II and the use of a sorted array.
        //-3,-3,1,2,3,4.
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //this is the key to getting triplets without duplicates.

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) { //if the element before the current one is the same, move to the next element.
                continue;
            }
            for(int left = i+1, right = nums.length-1; left < right;) { //basically, initializing left and right pointers and having a condition that left < righe
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); //add triplet array to the list
                    left++;
                    right--;
                    while ((left < right) && (nums[left] == nums[left-1])) { //if the current index is the same as before, move to avoid duplicate
                        left++;
                    }
                    while((left < right) && (nums[right] == nums[right+1])) {
                        right--;
                    }
                }
                else if (sum > 0) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,-1,0,0,1,-1};
        System.out.println(Arrays.toString(threeSum(nums).toArray()));

    }
}
