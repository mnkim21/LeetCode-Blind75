class Solution {
    public int maxSubArray(int[] nums) {
        /*
        maxSum
        currSum
        */

        // 1.
        // int maxSum = Integer.MIN_VALUE;
        // int currSum = 0;

        // for(int i = 0; i < nums.length; i++) {
        //     currSum = Math.max(currSum + nums[i], nums[i]);
        //     maxSum = Math.max(maxSum, currSum);
        // }
        // return maxSum;

        // 2.
        int maxSum = nums[0];
        int currSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = currSum > maxSum ? currSum : maxSum;

            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}