public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        //binary search gives logn operations.
        //we can search by index rather than value.
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4,9,13,19};
        System.out.println(searchInsert(test, 14));
    }
}

/*
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
 */
