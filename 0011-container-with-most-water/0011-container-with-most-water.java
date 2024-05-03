class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length -1;

        while(left < right) {
            int containerWidth = right - left;
            int containerHeight = Math.min(height[left], height[right]);
            result = Math.max(result, containerWidth * containerHeight);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}