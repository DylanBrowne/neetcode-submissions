class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            int length = s.length();
            result.append(String.format("%04d", length) + s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            StringBuilder result = new StringBuilder();
            int strLength = Integer.parseInt(str.substring(i, i + 4));
            i += 4;

            result.append(str.substring(i, i + strLength));
            
            i += strLength;
            list.add(result.toString());
        }
        return list;
        //012345678901234567
        //0005Hello0005World
        //    ^

        //i = 4
        //result = ""
        //strLength = 0005 -> 5
        //j = 0 -> 0 < 5


    }
}
