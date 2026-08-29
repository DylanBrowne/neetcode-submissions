class Solution {

    public String encode(List<String> strs) {
        String result = "";

        for (String s : strs) {
            int length = s.length();
            result += String.format("%04d", length);
            result += s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            String result = "";
            int strLength = Integer.parseInt(str.substring(i, i + 4));
            i += 4;

            result += str.substring(i, i + strLength);
            
            i += strLength;
            list.add(result);
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
