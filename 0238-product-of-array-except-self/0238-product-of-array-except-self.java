class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // FAIL - Time Limit Exceeded
        // int[] result = new int[nums.length];
    
        // for(int i = 0; i < nums.length; i++) { // except num
        //     int proNums = 1;
        //     for(int y = 0; y < nums.length; y++) { // product nums
        //         if( i == y) {
        //             continue;
        //         }
        //         proNums *= nums[y];
        //     }
        //     result[i] = proNums;    
        // }
        // return result;
        
        //====================================================================
        // lefe [Except Self] right
        int[] result = new int[nums.length];

        // 1. left
        int proNums = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = proNums;
            proNums *= nums[i];
        }
        
        // 2. right
        proNums = 1;
        for(int y = nums.length -1; y >= 0 ; y--) {
            result[y] *= proNums;
            proNums *= nums[y];
        }

        return result;
    }
}