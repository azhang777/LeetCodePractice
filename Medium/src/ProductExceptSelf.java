import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        //given num array, return answer array that has elements equal to the product of all the other num array elements besides current index.
        //using prefix and postfix, we can get the right product for each index.
        //as a result, each index element will be the product of the entire integer array except its own index.
        //say we have an int array {1,2,3,4}
        // by first going prefix, we will have answer array look like 1(a-1),1(a*b-1),2(a*b*c-1),6(a*b*c*d-1) -1 because we start outside of the left of the array with prefix basically [1],1,2,3 are the only considered elements in the int array.
        // after this, we can go through the int array postfix and multiply it with the current answer array. +1 because we start outside of the right of the array with postfix basically 2,3,4,[1] are the only considered elements in the int array.
        // it would look like this answer array: 1 * (24)(d*c*b*a+1),1 * (12)(d*c*b+1),2 * (4)(d*c+1),6 * (1)(d+1)
        //result will be 24,12,8,6
        int[] answer = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length-1; i > -1; i--) {
            answer[i] *= postfix;
            postfix *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(test)));
    }
}

/*
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    answer[i] *= nums[j];
                }
            }
        }
        return answer;
 */