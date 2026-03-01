
import java.util.Scanner;
public class multiply2matrix {

public static void main(String[] args)
{
int[][] arr1 = { { 1, 1 },
{ 2, 2 } };
int[][] arr2 = { { 1, 1 },
{ 2, 2 } };


 int m1=arr1.length;
 int n1=arr1[0].length;
 int m2=arr2.length;
 int n2=arr2[0].length;

 if(n1!=m2){
    System.out.println("Multiplication not possible");
    return;
 }
 else{
    int[][]res=new int[m1][n2];
    for(int i=0;i<m1;i++){
        for(int j=0;j<n2;j++){
            res[i][j]=0;
            for(int k=0;k<arr2.length;k++){
                res[i][j]+=arr1[i][k]*arr2[k][j];
                
            }
            System.out.print(res[i][j]+" ");
            

        }
        System.out.println();

    }
 }

    
}
}
