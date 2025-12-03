package BinarySearch;

class Binary{
    int search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if(arr[middle] == target){
                return middle;
            }
            else if(target < arr[middle]){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }   
        return -1; 
    }
}

public class BinarySearch {
    public static void main(String[] args){
        Binary B1 = new Binary();
        int[] arr = {2, 6, 3, 4, 8, 9, 12, 14};
        System.out.println(B1.search(arr, 8));
        ;
    }
}
