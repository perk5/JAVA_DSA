package RMergeSort;
import java.util.Arrays;

public class RMergeSort {

    public static void mergeSort(int[] data, int start, int end){
        if (start < end){
            int mid = start + (end - start) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);  
        }
    }

    public static void merge(int[] data, int start, int mid, int end){
        // Building temp array to avoid modifying the original content....

        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        // While both sub-arrays have values, then try and merge them in sorted order....

        while(i <= mid && j <= end){
            if(data[i] <= data[j]){
                temp[k] = data[i];
                i++;
                k++;
            }else{
                temp[k] = data[j];
                j++;
                k++;
            }
        }

        while(i <= mid){
            temp[k++] = data[i++];
        }
         while(j <= end){
            temp[k++] = data[j++];
        }

        for(i = start; i<= end; i++){
            data[i] = temp[i - start];
        }
        System.out.println(Arrays.toString(data));
    }


    public static void main(String args[]){
        int[] arr = new int[] {4, 6, 2, 1, 8, 9};

        mergeSort(arr, 0, arr.length - 1);
    }
}
