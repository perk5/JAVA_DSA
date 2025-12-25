package BubbleSort;
import java.util.Arrays;

class Bubble{

    int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                int temp = arr[j];
                if(temp > arr[j + 1]){
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }

        return arr;
    }
}

public class BubbleSort {
    public static void main(){
        Bubble b1 = new Bubble();
        int[] unsortedArray = {1, 2, 3, 4, 5};
        b1.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
     }
}
