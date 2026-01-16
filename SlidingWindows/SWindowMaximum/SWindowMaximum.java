package SlidingWindows.SWindowMaximum;
import java.util.*;

public class SWindowMaximum {

        public static int[] maximum(int[] arr, int k){

            int n = arr.length;
            int[] newArray = new int[n - k + 1];
            Deque<Integer> Deque = new LinkedList<>();

            for(int i = 0; i < arr.length; i++){
                while(!Deque.isEmpty() && Deque.peek() < i - k + 1){
                    Deque.poll();
                }

                while(!Deque.isEmpty() && arr[Deque.peekLast()] < arr[i]){
                    Deque.pollLast();
                }

                Deque.add(i);

                if(i >= k-1){
                    newArray[i-k + 1] = arr[Deque.peek()];
                }

            }
            return newArray;
        }    
            


            // Brute force TC -> O(n * k) SC -> O(n)
        //     List<Integer> newArray = new ArrayList<>();
            
        //     for(int i = 0; i <= arr.length - k; i++){
        //         int maximum = 0;
        //         for(int j = i; j < i + k; j++){
        //             if(arr[j] > maximum){
        //                 maximum = arr[j];
        //             }
        //         }
        //         newArray.add(maximum);
        //     }
        //     return newArray;
        // }

        public static void main(String args[]){
            int[] arr = new int[]{5,8,3,2,10,18};
            int k = 2;
            System.out.println(Arrays.toString(maximum(arr, k)));

    }
}
