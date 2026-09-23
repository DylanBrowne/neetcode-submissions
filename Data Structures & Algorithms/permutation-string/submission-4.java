class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }
        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {

            System.out.println("Is equal?: " + s1Count.equals(s2Count));
            System.out.println(s1Count.entrySet() + " ~ ~ ~ " + s2Count.entrySet());
            if (s1Count.equals(s2Count)) return true;

            // Add character at right pointer
            s2Count.put(s2.charAt(r), s2Count.getOrDefault(s2.charAt(r), 0) + 1);
            System.out.println("Adding character: " + s2.charAt(r));

            // Remove character at left pointer
            System.out.println(s2Count.get(s2.charAt(l)));
            s2Count.put(s2.charAt(l), s2Count.get(s2.charAt(l)) - 1);
            System.out.println(s2Count.get(s2.charAt(l)));
            if (s2Count.get(s2.charAt(l)) == 0) {
                s2Count.remove(s2.charAt(l));
            }
            System.out.println("Removing character: " + s2.charAt(l));
            l++;

            System.out.println("Current map: " + s2Count.entrySet());
        }

        return s1Count.equals(s2Count);
    }
}
