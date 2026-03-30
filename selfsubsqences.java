import java.util.*;
public class selfsubsqences {

    static ArrayList<String> subSSQ(String s){

        ArrayList<String> ans=new ArrayList<>();

        if(s.length()==0){

            ans.add("");

            return ans;
        }

        char curr=s.charAt(0);

        ArrayList<String> smallans=subSSQ(s.substring(1));

        for(String ss: smallans){

            ans.add(ss);

            ans.add(curr+ss);
        }

        return ans;
    }

    public static void main(String args []){

        System.out.println("enetr your any charecter");

        Scanner Sc=new Scanner(System.in);

        String s=Sc.nextLine();


        System.out.println(subSSQ(s));

    }
    
}
