import java.util.Scanner;
public class maxstring {
//   Approach:  Integer Conversion (Brute Force)
//


//    public static void main(String[] args) {
//        String [] arr={"999","1018","0078"};
//        int mx=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int n=Integer.parseInt(arr[i]);
//            mx=Math.max(mx,n);
//        }
//        System.out.println(mx);
//    }

//    Approach: String Comparison(Better)
//    Remove leading zeros
//    Compare lengths
//    If same length → compare digit by digit

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();

            sc.nextLine();   // ⭐ mandatory

            String []arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLine();
            }
            String maxs=arr[0];
            for(int i=1;i<n;i++){
                maxs=max(maxs,arr[i]);
            }
            System.out.println(maxs);
        }
        public static String max(String s, String t){
            String s1=purify(s);
            String s2=purify(t);

            if( s1.length()>s2.length()) return s ;
            if(s2.length()>s1.length()) return t;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    if(s1.charAt(i)>s2.charAt(i)) return s;
                    else return t;
                }

            }
            if (s.length() > t.length()) return s;
            else return t;

        }
        public static String purify(String s1){
            int i = 0;

            while(i < s1.length() && s1.charAt(i) == '0'){
                i++;
            }

            // all zeros case
            if(i == s1.length()) return "0";

            return s1.substring(i);
        }

}

