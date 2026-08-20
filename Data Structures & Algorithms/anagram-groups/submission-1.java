class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String soted = new String(str);
            map.putIfAbsent(soted, new ArrayList<>());
            map.get(soted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
