class Solution {
    public int search(int[] nums, int target) {
        // 1.
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target) {
        //         return i;
        //     }
        // }
        // return -1;

        // 2.
        // Ascending order, rotated
        // left - mid - right
        // if nums[l] <= target < mid) , else mid < target =< nums[r]
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]) {
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}