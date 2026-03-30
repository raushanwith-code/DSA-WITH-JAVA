import java.util.*;
class tets5{

    static int number(int n){

        if(n==0){

            return 0;
        }

        System.out.println("raushan yadav");

       return  number(n-1);

    
    }
    public static void main(String args []){



        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        System.out.println(number(n));


    }
}