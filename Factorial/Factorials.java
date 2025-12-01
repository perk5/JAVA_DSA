package Factorial;

class Fact {
    // int data;
    // Fact(int data){
    //     this.data = data;
    // }

    int fact(int data){
        if(data >= 1){
            return data * fact(data - 1);
        }else{
            return 1;
        }
    }
 
}

class Factorials{
    public static void main(String args[]){
        Fact f1 = new Fact();
        System.out.println(f1.fact(5));
    }
}
