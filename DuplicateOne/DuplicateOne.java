package DuplicateOne;
import java.util.HashMap;

public class DuplicateOne {

    public static boolean duplicates(int[] nums, int k){

        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(num.containsKey(nums[i])){
                if(i - num.get(nums[i]) <= k){
                    return true;
                } 
            } 
            num.put(nums[i], i);
        }

        return false;
    }

    public static void main(String args[]){
        int[] arr = new int[]{8, 6, 8, 10, 10, 9};
        int k = 1;
        System.out.println(duplicates(arr, k));
    }
}
