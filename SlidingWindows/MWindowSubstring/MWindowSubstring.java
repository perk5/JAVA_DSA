package SlidingWindows.MWindowSubstring;

import java.util.*;

public class MWindowSubstring {

    public static int minimumLength(String s, String t) {

        // if(t.length() > s.length()){
        //     return 0;
        // }

        int length = Integer.MAX_VALUE;
        int left = 0;
        char[] tc = t.toCharArray();
        char[] sc = s.toCharArray();

        Map<Character, Integer> tHash = new HashMap<>();
        Map<Character, Integer> subStringHash = new HashMap<>();

        int unique = 0;
        int create = 0;
        for (char c : tc) {
            if (!tHash.containsKey(c)) {
                unique++;
            }
            tHash.put(c, tHash.getOrDefault(c, 0) + 1);
        }

        for (int right = 0; right < s.length(); right++) {

            char rChar = sc[right];
            subStringHash.put(rChar, subStringHash.getOrDefault(rChar, 0) + 1);

            if (tHash.containsKey(rChar) &&
                    subStringHash.get(rChar).intValue() == tHash.get(rChar).intValue()) {
                create++;
            }
            while (create == unique) {
                length = Math.min(length, right - left + 1);
                char lChar = sc[left];
                subStringHash.put(lChar, subStringHash.get(lChar) - 1);

                if (tHash.containsKey(lChar) &&
                        subStringHash.get(lChar) < tHash.get(lChar)) {
                    create--;
                }

                if (subStringHash.get(lChar) == 0) {
                    subStringHash.remove(lChar);
                }
                left++;
            }

        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }

    public static void main(String args[]) {
        String s = "a"; // sc
        String t = "zz"; // tc
        System.out.println(minimumLength(s, t));
    }
}