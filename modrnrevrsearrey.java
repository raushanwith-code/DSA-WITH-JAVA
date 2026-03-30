/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class modrnrevrsearrey
{

    public static void swap(int arr[]){

        int i=0, j=arr.length-1;
 
        
        while(i<=j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
    }
}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        System.out.println("enter your arrey size");
        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        int arr[]=new int [n];

        for(int i=0; i<arr.length; i++){

           arr[i]=Sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }

        swap(arr);
        for(int ele: arr){

            System.out.print(ele+" ");
        }

       
        }
       
	}


