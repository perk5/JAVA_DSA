package QuickSort;

import java.util.Arrays;

class QSorting{
    int[] sort(int[] arr, int left, int right){
        if (left >= right){
            return arr;
        }
        int p = Partion(arr, left, right);

        sort(arr, left, p - 1);
        sort(arr,  p + 1, right);
        return arr;
    }

    int Partion(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for(int j = left ; j < right; j++){
            if(arr[j] <= pivot){
                i += 1;
                swap(arr, i, j);
            }     
        }
        
        swap(arr, i + 1, right);
        return i + 1;
        
    }

    void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

public class QuickSort{
    public static void main(String args[]){
        int[] arr = {-2, -3, 0, 3, 1, -1};
        QSorting QS = new QSorting();
        QS.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}