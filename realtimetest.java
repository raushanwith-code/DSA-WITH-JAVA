import java.util.*;
public class realtimetest{

    static int contDigit(int n){

        if(n==0){

            return 0 ;
        }

      return contDigit(n%10)+contDigit(n/10);

        
    }

    public static void main(String args []){
         System.out.println("enter your any number");
        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        System.out.println(contDigit(234));
    }
}