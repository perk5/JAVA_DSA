package ReversingStringRecursion;

public class ReversingStringRecursion{

    public static String reverse(String input){
        if(input.equals("")){
            return "";
        }
        return input.substring(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static void main(String args[]){
        System.out.println(reverse("My Dog"));
    }
}
