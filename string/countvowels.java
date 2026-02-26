import java.util.Scanner;
class countvowels{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            
            char iv=s.charAt(i);
            if(iv=='a'|| iv=='e' || iv=='i' || iv=='o' || iv=='u')
                count++;
            
        }
        System.out.println(+count);
        System.out.println(+count);
    }
}