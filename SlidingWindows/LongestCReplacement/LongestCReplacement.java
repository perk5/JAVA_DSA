package SlidingWindows.LongestCReplacement;

public class LongestCReplacement {

    public static int LongestCharactersReplacement(String word, int k){
        int[] characters = new int[26];
        char[] arr = word.toCharArray();

        if(k >= word.length()){
            return 0;
        }

        for(int i = 0; i < word.length(); i++){
            characters[word.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(characters[i] > 1){
               return 0;
            }
        }

        for(int i = 1; i < k + 1; i++){
            arr[i] = arr[0];
        }
       
        word = new String(arr);
        System.out.println(word);
        return k+1; 
    }

    public static void main(String args[]){
        String word = "abcd";
        int k = 4;
        System.out.println(LongestCharactersReplacement(word, k));
    }
}
