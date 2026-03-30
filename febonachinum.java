import java.util.*;
public class febonachinum {


    static int febbonum(int n){

        if(n==0||n==1){

            return n;
        }

        return febbonum(n-1)+febbonum(n-2);
    }

    public static void main(String args []){

        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        for(int i=0; i<9; i++){

            
        System.out.println(febbonum(i));

        }

    }
    
}
