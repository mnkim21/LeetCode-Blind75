class Solution {
    public String longestPalindrome(String s) {
        String result = "";

        // abcdcbfgh >> bcdcb
        for(int first = 0; first < s.length(); first++) {
            for(int second = first + 1; second <= s.length(); second++) {
                String subStr = s.substring(first, second);
                if(isPalindrome(subStr) && subStr.length() > result.length()) {
                    result = subStr;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}