package TwoSums;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    public static int[] add(int[] arr,int target){

        // Exponential Growth...

        // int[] index = new int[2];
        // for(int i = 0; i < arr.length - 1; i++){
        //    for(int j = i + 1; j < arr.length; j++){
        //         int a = arr[i] + arr[j];
        //         if(a == target){
        //             index[0] = i;
        //             index[1]= j;
        //             return index;
        //         }
        //    }
        // }
        // return null;


        // Excellent Time Complexity...... O(n)

        HashMap<Integer, Integer> array = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(array.containsKey(complement)){
                return new int[]{array.get(complement), i};
            }
            array.put(arr[i], i);
        }
        return null;

    }

    public static void main(String args[]){
        int[] array= new int[]{5, 7, 2, 8};
        System.out.println(Arrays.toString(add(array, 10)));
    }
}
