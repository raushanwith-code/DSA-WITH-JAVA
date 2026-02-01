import java.util.*;
public class testallprograminjava {

  
 public static void main(String args []){

  int factorial=1;

    Scanner Sc=new Scanner(System.in);
    System.err.println("enetr a number");
    int n=Sc.nextInt();

    for(int i=1; i<=n; i++){

        factorial=factorial*i;
    }
    System.out.println(factorial);
 }
      
  }
     

