class Solution {
    public int countSubstrings(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int y = i; y < s.length(); y++) {
                if(isPalindrome(s, i, y)) {
                    result++;
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String str, int left, int right) {
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}