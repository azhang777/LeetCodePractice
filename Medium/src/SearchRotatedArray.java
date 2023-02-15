public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        //this needs to be in log n efficiency.
        //I need to do a binary search to find the number, then return the index in which this number is at.
        //the trick is that the "sorted array" is rotated at a certain index that I do not know about
        //should I find when i+1 < i. This is where the index is rotated at which can allow me to break the index and find the target with binary search.

        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == nums[middle]) {
                return middle;
            }

            //find the pivot point. left side
            if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1;
                }
                else {
                    left = middle + 1;
                }
            }
            else {
                if (target <= nums[right] && target > nums[middle]) {
                    left = middle + 1;
                }
                else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}
