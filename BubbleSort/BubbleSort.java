package BubbleSort;
import java.util.Arrays;

class Bubble{

    int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                int temp = arr[j];
                if(temp > arr[j + 1]){
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}

public class BubbleSort {
    public static void main(){
        Bubble b1 = new Bubble();
        int[] unsortedArray = {53, 41, 33, 27, 11};
        b1.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
     }
}
