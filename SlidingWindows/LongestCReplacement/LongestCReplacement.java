package SlidingWindows.LongestCReplacement;

public class LongestCReplacement {

    public static int LongestCharactersReplacement(String word, int k){
        int left = 0;
        int right = 0;
        int maxOccurance = 0;
        int ans = 0;

        int[] occurance = new int[26];

        for(right = 0; right < word.length(); right++){
            maxOccurance = Math.max(maxOccurance, ++occurance[word.charAt(right) - 'a']);

            if(right - left + 1 - maxOccurance > k){
                occurance[word.charAt(left) - 'a']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }   
        return ans;
    
    }

    public static void main(String args[]){
        String word = "abbac";
        int k = 2;
        System.out.println(LongestCharactersReplacement(word, k));
    }
}


// char[] arr = word.toCharArray();

        // if(k >= word.length()){
        //     return 0;
        // }

        // for(int i = 0; i < word.length(); i++){
        //     characters[word.charAt(i) - 'a']++;
        // }

        // for(int i = 0; i < 26; i++){
        //     if(characters[i] > 1){
        //        return 0;
        //     }
        // }

        // for(int i = 1; i < k + 1; i++){
        //     arr[i] = arr[0];
        // }
       
        // word = new String(arr);
        // System.out.println(word);
        // return k+1; 