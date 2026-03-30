import java.util.*;
class recursiontest{

    static int RecursionTest(int n){

        if(n==1){
                   
            return 1;
        }
     
        
       System.out.println("raushan yadav");


       return RecursionTest(n);


    }

    public static void main(String args []){

     System.out.println("enter a number");

 

        System.out.println(RecursionTest(7));

    }

}