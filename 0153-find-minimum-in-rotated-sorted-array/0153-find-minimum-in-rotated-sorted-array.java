class Solution {
    public int findMin(int[] nums) {
        // 1.
        // for(int i = 0; i < nums.length - 1; i++) {
        //     if(nums[i] > nums[i+1]) {
        //         return nums[i+1];
        //     }
        // }
        // return nums[0];

        //2.
        // left -- mid -- right
        // compare mid with right -> if mid is smaller than right -> right = mid / else left = mid + 1
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2; // 1) 0 + (0+6)/2 = 3; 2)4 + (6-4) / 2 = 5;

            if(nums[mid] < nums[right]) { // nums[mid] = 7 mid[r] = 2 -> else left = 3 + 1 = 4
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}