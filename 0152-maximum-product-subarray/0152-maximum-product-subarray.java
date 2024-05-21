class Solution {
    public int maxProduct(int[] nums) {
        // !!! Nagative(-) * Nagative(-) = PLUS(=)

        int currMax = nums[0];
        int currMin = nums[0];
        int result = currMax;

        // int i = 1 -> if the array's length is One, The Answer is nums[0]
        for(int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            int tempMax = Math.max(curr, Math.max(currMax * curr, currMin * curr));
            currMin = Math.min(curr, Math.min(currMax * curr, currMin * curr));

            currMax = tempMax;
            result = Math.max(result, currMax);
        }
        return result;
    }
}