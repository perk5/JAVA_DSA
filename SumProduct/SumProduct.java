package SumProduct;
import java.util.*;

public class SumProduct {

    public static int[] sumProducts(int[] arr){
        int[] answer = new int[arr.length];

        int pre = 1;
        int post = 1;

        for(int i = 0; i < arr.length; i++){  
            if(i > 0){
                answer[i] = arr[i - 1] * pre;
            }else{
                answer[i] = arr[i] * pre;
            }
            
            if(i > 0){
                if(arr[i-1] == 0){
                    pre = 1;
                }else{
                    pre = arr[i-1];
                } 
            }
        }

        for(int i = arr.length - 1; i >= 0; i--){
            if(i <= arr.length - 2){
                int newNumber = arr[i + 1] * post;
                answer[i] = newNumber * answer[i];
            }else{
                answer[i] = answer[i] * post;
            }



            if(i <= arr.length - 2){
                post = arr[i + 1] * post;
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String args[]){
        int[] arr = new int[]{3, 4, 5, 6};
        sumProducts(arr);
    }
}
