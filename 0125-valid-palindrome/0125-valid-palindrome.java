class Solution {
    public boolean isPalindrome(String s) {
        /*
        String -> char[]
        Two pointer : left -> index++ / right -> index--

        isLetterOrDigit -> remove non-alphanumeric characters
         */
        
        int left = 0, right = s.length() - 1;
        while(left <= right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            } else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            } else {
                if(Character.toUpperCase(leftChar) != Character.toUpperCase(rightChar)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}