package Duplicate;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public static boolean duplicate(int[] arr){
        HashSet<Integer> a = new HashSet<>();

        for(int i : arr){
            if(a.contains(i)){
                return true;
            }
            a.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[] {5, 2, 7, 4, 2};
        System.out.println(duplicate(array));
    }
}