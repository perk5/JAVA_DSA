package SlidingWindows.VerifyingPermutations;

public class VerifyingPermutations {

    public static boolean permutation(String s1, String s2){

        if(s1.length() > s2.length()){
            return false;
        }

        int[] mapS1 = new int[26];
        int[] mapS2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            mapS1[s1.charAt(i) - 'a']++;
            mapS2[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length() - s1.length(); i++){
            if(matches(mapS1, mapS2)){
                return true;
            }
            mapS2[s2.charAt(i+s1.length()) - 'a']++;
            mapS2[s2.charAt(i) - 'a']--;
        }

        return matches(mapS1, mapS2);
    }

    private static boolean matches(int[] map1, int[] map2){
        for(int i = 0; i < 26; i++){
            if(map1[i] != map2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s1 = "ab";
        String s2 = "cdncbrab";
        System.out.println(permutation(s1, s2));
    }
}
