class rotatematrixclockwise90degree {
    public static void main(String[] args) { 
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int m = matrix.length;        // number of rows
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


//logic to reverse each row i.e 1D Array.
for(int i=0;i<n;i++){
int low = 0, high = n-1;
while(low < high)
{
int temp = matrix[i][low];
matrix[i][low] = matrix[i][high];
matrix[i][high] = temp;
low++;
high--;
}
}
for(int i=0;i<m;i++){
  for(int j=0;j<n;j++){
    System.out.print(matrix[i][j]+" ");
  }
  System.out.println();
}
    }
}
        

    

