package DynamicArrays;
import java.util.ArrayList;

class MeraList{
    int size = 1;
    int n = 0;
    ArrayList<Object> dynamicArray;

    //Constructor...
    MeraList(int capacity){ 
        // this.size = size;
        // this.n = n;
        this.dynamicArray = makeArray(size);
    }

    //Print Array...
    String printArray(){
        String arr = "";
        for(int i = 0; i < n; i++){
            arr = arr + dynamicArray.get(i) + ", ";
        }
        return "[" + arr.substring(0, arr.length() - 2) + "]";
    }

    // Get Index of the item in the array

    Object Getindex(Object item){

        for (int i = 0; i < n; i++){
            if (dynamicArray.get(i) == item){
                return i;
            }
        }
        return "Not found";
    }



    // Adding Items...
    void addItem(Object item){
        if (n == size){
             _resize(size * 2);
        }

        dynamicArray.add(item);
        n = n + 1;
    }

    // Resizing Array...
    void _resize(int capacity){
        ArrayList<Object> newArray = makeArray(capacity); 
        size = capacity;
        for (int i = 0; i < n; i++){
            newArray.add(dynamicArray.get(i));
        }
        dynamicArray = newArray;
    }

    // Creating Dynamic object...
    ArrayList<Object> makeArray(int size){
        ArrayList<Object> dynamicArray = new ArrayList<>(size);
        return dynamicArray;
    }

    // Length of an Array...
    int totalLength(){
        return dynamicArray.size();
    }
}


public class DynamicArrays {
    public static void main(String args[]){
        MeraList m1 = new MeraList (1);   
        System.out.println(m1.totalLength());
        m1.addItem("Hello");
        m1.addItem("Hello2");
        m1.addItem("Hello3");
        m1.addItem(1);
        m1.addItem("Hello4");
        m1.addItem("Hello5");
        System.out.println(m1.totalLength());
        System.out.println(m1.Getindex("Hell")); 
    }
}
