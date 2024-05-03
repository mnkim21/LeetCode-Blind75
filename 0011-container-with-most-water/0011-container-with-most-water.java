class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length -1;

        while(left < right) {
            int width = right - left;
            // int minHeight = Math.min(height[left], height[right]);
            int minHeight = height[left] < height[right] ? height[left] : height[right];
            int newArea = width * minHeight;
            result = Math.max(result, newArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}