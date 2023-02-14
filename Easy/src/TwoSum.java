import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        //storing all the elements of the array into a hashmap for quick search.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //rather than finding two numbers that add up to the target, we can just find the complement to a number with the target.
            if (map.containsKey(complement) && map.get(complement) != i) { //if the map contains the complement and it is not the same as i, we can return the complement and i index.
                return new int[] {i, map.get(complement)};
            }
        }
        return null;
    }
    public static void main(String[] args) {

        int[] myArray = {1,2,3};
        System.out.println(Arrays.toString(twoSum(myArray,5)));

    }
}

/*
         int[] indices = new int[2];
        //Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                //nums[i] + nums[j] = target;
                if (nums[i] + nums[j] == target) {
                    indices[0] =
                    indices[1] = Arrays.binarySearch(nums, nums[j]);
                    return indices;
                }
            }
        }
        return null;*/

/*
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return null;
 */
