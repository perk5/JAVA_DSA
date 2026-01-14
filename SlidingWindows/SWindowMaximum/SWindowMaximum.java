package SlidingWindows.SWindowMaximum;
import java.util.*;

public class SWindowMaximum {

        public static List<Integer> maximum(int[] arr, int k){
            // Brute force TC -> O(n * k) SC -> O(n)
            List<Integer> newArray = new ArrayList<>();
            
            for(int i = 0; i <= arr.length - k; i++){
                int maximum = 0;
                for(int j = i; j < i + k; j++){
                    if(arr[j] > maximum){
                        maximum = arr[j];
                    }
                }
                newArray.add(maximum);
            }
            return newArray;
        }

        public static void main(String args[]){
            int[] arr = new int[]{5,8,3,2,10,18};
            int k = 3;
            System.out.println(maximum(arr, k));

    }
}
