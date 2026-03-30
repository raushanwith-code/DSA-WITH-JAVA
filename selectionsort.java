public class selectionsort {


    static void  selectSortNum(int arr[]){

        for(int i=0; i<arr.length; i++){

            int min_value=i;

            for(int j=i+1; j<arr.length; j++){

               if(arr[j]<arr[min_value]){

                min_value=j;

                
               }
            }

            int temp=arr[i];

                arr[i]=arr[min_value];

                arr[min_value]=temp;
        }

        System.out.println("your final resultis :");

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }
    }

    public static void main(String args []){

        System.out.println("enetr your arrey element");

        int arr[]={45,12,23,90,45,12,5};

        selectSortNum(arr);

       

    }
    
}
