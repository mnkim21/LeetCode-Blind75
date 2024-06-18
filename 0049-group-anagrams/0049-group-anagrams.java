class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) { // Put strs[i] into word
            char[] chars = word.toCharArray(); // string -> char[]
            Arrays.sort(chars);// sort
            String sortedWord = new String(chars); // convert char[] to String

            // if the key =/= sortedword -> To make a new Key
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word); // Add a value into the key with sortedWord.
        }
        return new ArrayList<>(map.values());
    }
}