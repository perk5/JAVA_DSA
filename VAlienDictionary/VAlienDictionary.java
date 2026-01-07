package VAlienDictionary;
import java.util.*;

public class VAlienDictionary {

    public static boolean VAlienDictionary(String[] names, String order){

        Map<String, Integer> dict = new HashMap<>();

        for(int i = 0; i < order.length(); i++){
            dict.put(Character.toString(order.charAt(i)), i);
        }
        System.out.println(dict);

        for(int i = 0; i < names.length - 1; i++){
            
            for(int j = 0; j < names[i].length(); j++){
                if(j >= names[i+1].length()){
                    return false;
                }
                if(names[i].charAt(j) != names[i + 1].charAt(j)){
                    int current = dict.get(names[i].substring(j, j+1));
                    int next = dict.get(names[i + 1].substring(j,j+ 1 ));
                    if(current > next){
                        return false;
                    }else{
                        break;
                    }
                }

                // if(dict.get(names[i].substring(0, 1)) > 
                // dict.get(names[i + 1].substring(0,1 ))){
                //     return false;
                // }   
            }  
        }   
        return true;
    }

    public static void main(String args[]){

        String[] names = new String[]{"dag", "cag", "fot"};
        String order = "dcagfot";

        System.out.println(VAlienDictionary(names, order));
    }
}
