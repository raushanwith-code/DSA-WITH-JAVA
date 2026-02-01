public class seclarghestarrey {

    public static void main(String args[]){

        int arr[]={-10,-8,-430,12,-5234,-56};

        int max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            max=Math.min(max,arr[i]);
        }
        int secmax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i]!=max){

               secmax=Math.min(secmax,arr[i]);
            }
            
        }
         System.out.println(max);
            System.out.println(secmax);
        
    }
    
}
