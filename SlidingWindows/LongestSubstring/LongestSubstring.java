package SlidingWindows.LongestSubstring;

import java.util.*;

public class LongestSubstring {

    public static int longestSubstring(String word) {
        char[] arr = word.toCharArray();
        int l = 0;
        int ans = 0;

        Set<Character> values = new HashSet<>();

        for (int r = 0; r < word.length(); r++) {

            while(values.contains(arr[r])) {
                values.remove(arr[l]);
                l++;
            }
            values.add(arr[r]);
            ans = Math.max(ans, values.size());
        }
        return ans;
    }

    public static void main(String args[]) {
        String word = "pwwcew";
        System.out.println(longestSubstring(word));
    }
}
