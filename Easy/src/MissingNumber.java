public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int res = 0;
        int sumRange = 0;
        int sumArray = 0;
        for (int i = 0; i < nums.length; i++) {
            sumArray += nums[i];
        }
        for (int i = 0; i <= nums.length; i++) {
            sumRange += i;
        }
        res = sumRange - sumArray;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int printNumber = missingNumber(nums);
        System.out.println(printNumber);
    }
}
