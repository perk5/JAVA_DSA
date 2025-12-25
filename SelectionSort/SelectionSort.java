package SelectionSort;
import java.util.Arrays;

class Sort{
    int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){   
                if( arr[min] > arr[j]){
                    min = j;  
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

           
        }
        return arr;
    }   
}

public class SelectionSort {
    public static void main(){
        Sort s1 = new Sort();
        int[] unsortedArray = {22, 54, 11, 1, 8};
        s1.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
}
