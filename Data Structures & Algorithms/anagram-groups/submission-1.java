class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        Map<Integer, String> map = new HashMap<>();

        for (int s = 0; s < strs.length; s++) {
            char[] chars = strs[s].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.put(s, sorted);
        }

        Map<String, List<String>> grouped = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
             grouped.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(strs[entry.getKey()]);
        }

        List<List<String>> result = new ArrayList<>(grouped.values());
        return result;
        
    }
}