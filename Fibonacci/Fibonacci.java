package Fibonacci;

class Fib{
    int number(int num){
        if(num <= 1){
            return num;
        }

        return number(num - 1) + number(num - 2);       
    }
}

public class Fibonacci {
    public static void main(String args[]){
        Fib f1 = new Fib();
        System.out.println(f1.number(5));
    }
}
