class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int idx = 0;

        for(int i = 0; i < s.length(); i++) {
            if(!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, charSet.size());
            } else {
                // s= dvdf -> i = 2) else -> remove idx=0 -> v + d + f => '3'
                while(charSet.contains(s.charAt(i))){
                    charSet.remove(s.charAt(idx));
                    idx++;
                }
                charSet.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}