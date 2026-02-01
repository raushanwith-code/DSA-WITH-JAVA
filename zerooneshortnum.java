public class zerooneshortnum {

    public static void main(String args []){

        int arr[]={1,0,0,1,0,2,0,0,1,2,0};
    
        int noofzero=0, noofone=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]==0) noofzero++;
            if(arr[i]==1)  noofone++;
        }
        for(int i=0; i<arr.length; i++){

            if(i<noofzero) arr[i]=0;

            else if(i<noofzero+noofone) arr[i]=1;
            else arr[i]=2;
        }
     for(int ele: arr){

        System.out.println(ele);
     }

    }
    
}
