class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length; i++) {
            // Present Elemtes for i =/= Previous -> Run
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    // Present Elemtes for j =/= Previous -> Run
                    while(j < k && nums[j] == nums[j - 1]) {
                        // continue; -> j++을 하지 않았기 때문에 while 조건문 조건에 해당하는 값으로 다시 루프
                        j++;
                    }
                }
            }
        }
        return result;
    }
}