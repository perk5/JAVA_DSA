package AnagramProblem;



public class AnagramProblem {
    public static boolean Anagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] charCount = new int[26];

        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int character: charCount){
            if(character != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s = "cat";
        String t = "tat";
        System.out.println(Anagram(s, t));
    }
}
