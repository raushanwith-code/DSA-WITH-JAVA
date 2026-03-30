import java.util.*;
class test10{
    public static void main(String args []){

        System.out.println("enter your a number");

        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){

                System.out.print("*");
            }

            for(int j=0; j<(2*(n-i)); j++){

                System.out.print(" ");
            }

            for(int j=0; j<n-n; j++){

                System.out.print(" ");
            }
            for(int j=0; j<i; j++){

                System.out.print("*");
            }

            System.out.println();
        }
         for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){

                System.out.print("*");
            }

            for(int j=0; j<(2*(n-i)); j++){

                System.out.print(" ");
            }

            for(int j=0; j<n-i; j++){

                System.out.print(" ");
            }
            for(int j=0; j<i; j++){

                System.out.print("*");
            }

            System.out.println();
        }


    }
}