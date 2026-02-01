public class tosumarrey {

    public static void main(String args []){

        int arr[]={1,2,3,4,5,6,7,89,9};
     
        int j=arr.length-1;
     
        for(int i=0; i<arr.length; i++){

           while(i<=j){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

              
            }


        }
        for(int ele: arr){

            System.out.print(ele+" ");
        }
      
    }
    
}
