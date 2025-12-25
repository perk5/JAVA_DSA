package MergeSort;
import java.util.ArrayList;

class MergeSorted{

    int i = 0;
    int j = 0;

    ArrayList<Integer> merged = new ArrayList<>();

    ArrayList<Integer> mergeSorted(int[] arr1,int[] arr2){
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged.add(arr1[i]);
                i += 1;
            }else{
                merged.add(arr2[j]);
                j += 1;
            }
        }
        
        

        while(i < arr1.length){
            merged.add(arr1[i]);
            j += 1;
        }

        while(j < arr2.length){
            merged.add(arr2[j]);
            j += 1;
        }

        System.out.println(merged);
        return merged;
    }

   

}

public class MergeSort {
    public static void main(){
        MergeSorted m1 = new MergeSorted();
        int[] arr1 = {1, 2, 5, 6};
        int[] arr2 = {3, 4, 7, 8, 9, 10, 11};
        m1.mergeSorted(arr1, arr2);
    }
}
