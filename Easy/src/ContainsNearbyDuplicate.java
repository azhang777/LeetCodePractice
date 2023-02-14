import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        }
        //find two elements that are equal but in different indices
        //check if the difference in indices is less than or equal to k.
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};

        containsNearbyDuplicate(nums,1);
    }
}
