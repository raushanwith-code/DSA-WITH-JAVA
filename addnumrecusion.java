import java.util.*;
public class addnumrecusion {

    static int  addNumber(int n){
        int count=0;
   n=Math.abs(n);
        if(n==0){

            return 0;
        }
     int lastnum=n%10;
       System.out.print(lastnum);
        return count+ addNumber(n/10);

    }
    public static void main(String args []){

        System.out.println("enter your any nuber");

        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();
    addNumber(n);

       
    }
    
}
