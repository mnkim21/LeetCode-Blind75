class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. count each alph
        // if(s.length() != t.length()) {
        //     return false;
        // }

        // int[] arr = new int[26];
        // for(int i = 0; i < s.length(); i++) {
        //     arr[s.charAt(i)-'a']++;
        //     arr[t.charAt(i)-'a']--;
        // }

        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] != 0) {
        //         return false;
        //     }
        // }
        // return true;

        // 2. sort
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}