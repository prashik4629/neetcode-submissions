class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> result = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            char [] charArray = s.toCharArray();

            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
