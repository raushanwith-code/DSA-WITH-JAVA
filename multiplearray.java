public class multiplearray {

  public static void main(String args []){

     int arr[][]={{1,2,3},{4,5,6}};
     int brr[][]={{5,4,3},{1,3,9},{8,9,0}};

     if(arr[0].length!=brr.length){

      System.out.println("mutltiple is not possible");

         
     }else{

         int crr[][]=new int[arr.length][brr.length];

         for(int i=0; i<crr.length; i++){

          for(int j=0; j<crr[0].length; j++){

            for(int k=0; k<brr.length; k++){

              crr[i][j] +=arr[i][k]*brr[k][j];

        

            }
            System.out.print(crr[i][j]+" ");
          }
             System.out.println();
           
         }
     }
  }
  
}
