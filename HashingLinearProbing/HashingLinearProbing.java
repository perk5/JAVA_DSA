package HashingLinearProbing;
import java.util.Arrays;
class Dictionary{

    int size;
    String[] slots;
    Integer[] data;

    Dictionary(int size){
        this.size = size;
        this.slots = new String[size];
        this.data = new Integer[size];
    }

    void put(String key, Integer value){
        int hash_value = this.hash_function(key);
        if(slots[hash_value] == null){
          slots[hash_value] = key;  
          data[hash_value] = value;
        }else{
            if(slots[hash_value] == key){
                data[hash_value] = value;
            }else{
                int new_hash_value = rehash(hash_value);
                while(slots[new_hash_value] != null && slots[new_hash_value] != key){
                    new_hash_value = rehash(new_hash_value);
                }
                if(slots[new_hash_value] == null){
                    slots[new_hash_value] = key;
                    data[new_hash_value] = value;
                }else{
                    data[new_hash_value] = value;
                }
            }
        }
        return;
    }

    int getData(String key){
        int hash_position = hash_function(key);
        if(key.equals(slots[hash_position])){
            return data[hash_position];
        }else{
            int curr_postion = hash_function(key);
            while(!key.equals(slots[hash_position])){
                if(slots[hash_position]  == null){
                    return -2;
                }
                hash_position = rehash(hash_position);
                if(hash_position == curr_postion && !key.equals(slots[curr_postion])){
                    return -1;
                }   
            }
            return data[hash_position];
        }
    }


    int rehash(int oldHash){
        return (oldHash + 1) % size;
    }

    int hash_function(String key){
        return Math.abs(key.hashCode()) % size;
    }
}


public class HashingLinearProbing {
    public static void main(){
        Dictionary D1 = new Dictionary(3);
        // System.out.println(Arrays.toString(D1.slots));
        // System.out.println(Arrays.toString(D1.data));
        D1.put("Php", 45);
        D1.put("Java", 25);
        // D1.put("Php", 32);
        System.out.println(Arrays.toString(D1.slots));
        System.out.println(Arrays.toString(D1.data));
        System.out.println((D1.getData("Java")));
        
        // D1.put("Java", 45);
        // System.out.println(Arrays.toString(D1.slots));
        // System.out.println(Arrays.toString(D1.data));
    }
}
