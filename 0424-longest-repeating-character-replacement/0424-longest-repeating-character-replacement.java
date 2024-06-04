class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26]; // A-Z : 26
        int res = 0;
        int freqLetter = 0;

        for(int l = 0, r = 0; r < s.length(); r++) {
            arr[s.charAt(r)- 'A']++;
            freqLetter = Math.max(freqLetter, arr[s.charAt(r)- 'A']);

            // Distance between left pointer and current right pointer
            int currWindowLength = r - l + 1; 
            // IF "currWindowLength - the most frequency character" is greater than K
            // = This means we need to change more than K characters.
            // = Time to shrink the window && move the left pointer to right
            if(currWindowLength - freqLetter > k){
                arr[s.charAt(l)- 'A']--;
                l++;
                currWindowLength = r - l + 1;
            }
            res = Math.max(res, currWindowLength);
        }
        return res;
    }
}