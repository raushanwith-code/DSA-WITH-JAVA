public class revrsenum {

    public static  void main(String args []){

        int arr[]={12,34,56,12,34,02};

        for(int i=0; i<arr.length; i++){

          
          int j=arr.length-1;
                while(i<=j){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            
            }
            for(int ele: arr){

                System.out.println(ele);
            }
        }


    }
    

