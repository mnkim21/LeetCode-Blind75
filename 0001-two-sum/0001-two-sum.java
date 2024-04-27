class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            for(
                for()
            )

            EX >> nums = 0 1 2 3
            0 -> 1 2 3 
            1 -> 2 3
            2 -> 3
        */
        int[] result = new int[2];
        int len = nums.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}