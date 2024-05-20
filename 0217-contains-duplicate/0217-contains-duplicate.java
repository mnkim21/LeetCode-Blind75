class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int first = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(first == nums[i]){
                return true;
            } else {
                first = nums[i];
            }
        }
        return false;
    }
}