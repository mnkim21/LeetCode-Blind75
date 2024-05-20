class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int first = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     if(first == nums[i]){
        //         return true;
        //     } else {
        //         first = nums[i];
        //     }
        // }
        // return false;

        Set<Integer> numsSet = new HashSet<>(); // SET = 중복허용x
        for(int i = 0; i < nums.length; i++) {
            if(numsSet.contains(nums[i])) {
                return true;
            } else {
                numsSet.add(nums[i]);
            }
        }
        return false;
    }
}