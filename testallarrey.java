import java.util.*;
class testallarrey{

    public static void main(String args []){

        System.out.println("enter your arrey size and element");
        Scanner Sc=new Scanner(System.in);

     int n=Sc.nextInt();

        int arr[]=new int[n];

         int max=arr[0];

        for(int i=1; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }
            for(int i=1; i<arr.length; i++){

                if(arr[i]<max){

                    max=arr[i];
                }
            }
            System.out.println(max);
        }

    }
 