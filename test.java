import java.util.*;
public class test{

static int FebonacchiNum(int n){

    if(n==0||n==1) return n;

    return FebonacchiNum(n-1)+FebonacchiNum(n-2);
}
    public static void main(String args []){

        System.out.println("enetr your number");

        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        

            System.out.println(FebonacchiNum(n));
        }


    }
