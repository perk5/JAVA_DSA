package TopKFElements;
import java.util.*;


public class TopKFElements {

    public static int[] frequentElements(int[] nums,int k){

        if(k == nums.length){
            return nums;
        }
        
        Map<Integer, Integer> mapping = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(mapping.containsKey(nums[i])){
                mapping.put(nums[i], mapping.get(nums[i]) + 1);
            }else{
                mapping.put(nums[i], 1);
            }  
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> mapping.get(a) - mapping.get(b)
        );

        for(int n: mapping.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = heap.poll();
        } 

        return ans;
    }

    public static void main(String args[]){
        int[] number = new int[]{2,2,1,1,1,1,3};
        int k = 2;
        System.out.println(Arrays.toString(frequentElements(number, k)));
    }
}
