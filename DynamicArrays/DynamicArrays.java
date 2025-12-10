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

    //Finding Item by value
    int findItem(Object item){
        for (int i = 0; i < n; i++){
            if(dynamicArray.get(i) == item){
                return i;
            }
        }
        return 0;
    }

    //Removing Item by value
    void removeItem(Object item){
        int itemIndex = findItem(item);

        deleteItem(itemIndex); 
    }


    //Inserting Values...
    void insertValue(int index, Object value){
        if (n == size){
             _resize(size * 2);
        }
        
        dynamicArray.add(null); 

        for(int i = n; i > index ; i--){
            dynamicArray.set(i, dynamicArray.get(i - 1));
        }
        dynamicArray.set(index, value);
        n = n + 1;
        // dynamicArray = newArray;
    }

    // Adding Items...
    void addItem(Object item){
        if (n == size){
             _resize(size * 2);
        }

        dynamicArray.add(item);
        n = n + 1;
    }

    //Deleting Items from Array
    void deleteItem(int item){        
        for(int i = item; i < n - 1 ; i++){
            dynamicArray.set(i, dynamicArray.get(i + 1));
        }

        dynamicArray.remove(n - 1);
        n = n - 1;    
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

    //Sorting Array
    int MaxValue(){
        int max = (int) dynamicArray.get(0);

        for(int i = 1; i < n; i++){
            int value = (int) dynamicArray.get(i);
            if(value > max){
                max = value;
            }
        }
        return max;
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
        m1.addItem(5);
        m1.addItem(8);
        m1.addItem(10);
        m1.addItem(1);
        m1.addItem(3);
        m1.addItem(9);
        System.out.println(m1.dynamicArray);
        System.out.println(m1.totalLength());
        // System.out.println(m1.Getindex("Hell"));
        System.out.println(m1.size);
        // m1.insertValue(1, "newValue");
        // m1.insertValue(3, "World");
        System.out.println(m1.dynamicArray);
        System.out.println(m1.MaxValue());
        // m1.deleteItem(55);
        // System.out.println(m1.dynamicArray);
        // m1.deleteItem(55);
        // m1.removeItem(1);
        // System.out.println(m1.dynamicArray);
    }
}
