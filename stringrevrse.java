import java.util.*;
public class stringrevrse{

    static String revrse(String name, int idx){

        if(idx==name.length()){

            return "";
        }

       String s= revrse(name,idx+1);

       return s+name.charAt(idx);
    }
    public static  void main(String args []){

        System.out.println("Enter any charecter");

        Scanner Sc=new Scanner(System.in);

        String name=Sc.nextLine();

      String ans=  revrse(name,0);

          

           if(ans.equals(name)){

            System.out.println("pilu nam");

           }else{
            System.out.println("not pelu");
           }

    }
}