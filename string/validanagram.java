// problem validanagram

// approach 1: sorting
// time:O(n log n)
// 

import java.util.Arrays;


public class validanagram {
    public static void main(String[] args){
    String s1="suman";
    String s2="namu";
    // isAnagram(s1,s2);
  System.out.println( isAnagram(s1,s2)) ;
    
   
    }
    public static boolean isAnagram(String s1, String s2){
         if(s1.length()!=s2.length()){
            return false;
        }
        else {
            char[] a=s1.toCharArray();
            char[] b=s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]) return false;

            }
            return true;

        }
     
    }
  
}
