public class search2dmatrix {
    public static void main(String[] args) {
        int[][] arr={
             {1,4,7,11,15},
             {2,5,8,12,19},
             {3,6,9,16,22},
             {10,13,14,17,24},

             {18,21,23,26,30}};
             System.out.println(searchMatrix(arr,5));
             

    }
    public static boolean searchMatrix(int[][] arr, int target) {
            int m=arr.length;
        int n=arr[0].length;
        
        int i=0,j=n-1;

       while(j>=0 && i<m){
        if(arr[i][j]==target) return true;
        else if(arr[i][j]>target) j--;
        else i++;

       }
       return false;
    }
        
    
}
