package LConsecutiveSequence; 
import java.util.*;

public class LConsecutiveSequence {

    public static int longestSequence(int[] nums){
        Set<Integer> numbers = new HashSet<>();

        for(int i = 0; i< nums.length; i++){
            numbers.add(nums[i]);
        }

        int lcs = 0;
        
        for(int n: numbers){
            int count = 1;
            if(!numbers.contains(n - 1)){
                while(numbers.contains(n+1)){
                    count++;  
                    n++;
                }
                lcs = Math.max(lcs, count); 
            }else{
                continue;
            }
        }

        return lcs;
    }

    public static void main(String args[]){
        int[] sequence = new int[]{100, 99, 4, 200, 1, 2, 3, 6, 7, 8};
        System.out.println(longestSequence(sequence));
    }
}
