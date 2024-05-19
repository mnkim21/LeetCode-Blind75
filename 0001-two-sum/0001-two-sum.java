class Solution {
    public int[] twoSum(int[] nums, int target) { 
        // ex) nums= [2,7,11,15] -> length = 4
        //1.
        // int[] result = new int[2];

        // for(int i = 0; i < nums.length - 1; i++) { // ex) 0 / 0 1 2
        //     for(int y = i + 1; y < nums.length; y++) { // ex) 1 / 1 2 3
        //         if(nums[i] + nums[y] == targe) {
        //             result[0] = i;
        //             result[1] = y;
        //         }
        //     }
        // }
        // return result;

        // 2.
        for(int i = 0; i < nums.length-1; i++) { // ex) 0 / 0 1 2
            for(int y = i+1; y <nums.length; y++) { // ex) 1 / 1 2 3
                if(nums[i] + nums[y] == target){
                    return new int[] {i, y};
                }
            }
        }
        return null;
    }
}