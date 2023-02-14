import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumProductArray {
    public static int maxProduct(int[] nums) {
        //keep track of 3 values, currentMax, currentMin, and n. We keep track of currentMin because it could possibly turn into max. 1,2,-3,-4. at -6, which is currentMin, -4 * -6 = 24 which is contiguous max.
        //edge case is 0, we do not want to deal with 0, so reset currentMax and min to 1 and move on to next.
        int currentMax = 1;
        int currentMin = 1;
        int result = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n == 0) {
                currentMax = 1;
                currentMin = 1;
            }
            // we need a temporary var because current max will be affected by the max method before current min is evaluated.
            int temp = n * currentMax;
            currentMax = Math.max(n * currentMax, n * currentMin);
            currentMax = Math.max(currentMax, n);
            currentMin = Math.min(temp, n * currentMin);
            currentMin = Math.min(currentMin, n);
            result = Math.max(result,currentMax);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        maxProduct(nums);
    }
}
