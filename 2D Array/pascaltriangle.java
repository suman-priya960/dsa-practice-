import java.util.Scanner;
import java.util.ArrayList;

public class pascaltriangle {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) l.add(1);
                else l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            ans.add(l);
        }
        for(ArrayList<Integer>l:ans){
            for(int i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
    

