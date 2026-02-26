import java.util.Arrays;
public class sortstring {
    public static void main(String[]args){
    String s="suman";
    char[] ch=s.toCharArray();
    Arrays.sort(ch);
    for(char ele:ch){
        System.out.println(ele);
    }
    StringBuilder sb=new StringBuilder("garg");
    char[] arr=sb.toString().toCharArray();
    Arrays.sort(arr);
     for(char ele:arr){
        System.out.println(ele);
    }
}
}
