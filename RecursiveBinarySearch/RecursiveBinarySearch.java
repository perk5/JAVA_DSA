package RecursiveBinarySearch;

class BinarySearch{

    int search(int[] arr, int target, int low, int high){

        if(low <= high){
            int middle = low + (high - low) / 2;

            if(arr[middle] == target){
                return middle;
            }

            if(target < arr[middle]){
                return search(arr, target, low, middle - 1);
            }
            else{
                return search(arr, target, middle + 1, high);
            }
        }
        return -1;
    }
}


public class RecursiveBinarySearch {
    public static void main(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch b1 = new BinarySearch();
        
        System.out.println(b1.search(array, 1, 0, array.length - 1));

    }
}
