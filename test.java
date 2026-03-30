<<<<<<< HEAD
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
=======
public class test {

  public static void main(String argsa []){

      int [][] a={{1,2,1},{2,1,2}};
      int [][]b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};

      if(a[0].length!=b.length){

        System.out.println("mutipili not possible");

      }else{

        //multipilication is posible

        int[][] c=new int[a.length][b[0].length];

        for (int i = 0; i < c.length; i++) {

          for(int j=0; j<c[0].length; j++){

            for(int k=0; k<b.length; k++){

              c[i][j] += a[i][k]*b[k][j];
            }

            System.out.print(c[i][j]+" ");
          }
          System.out.println();
          
        }


      }

     
      }
      
  }
  

>>>>>>> e80ff5518d8d42fb8a46bf90b6ea444f1edd6394
