package GroupAnagrams;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagram(String[] names){
        if(names.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> ansMap = new HashMap<>();
 
        int[] count =  new int[26];

        for(String s: names){
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < count.length; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList<>());
            }
            ansMap.get(key).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }

    public static void main(String args[]){
        String[] ana = new String[]{"tan", "atn", "tna", "can", "nac", "fan"};
        System.out.println(groupAnagram(ana));
    }
}
