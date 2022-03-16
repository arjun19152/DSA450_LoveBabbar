public class Search2Dmatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m=matrix.length; // no. of rows
        int n=matrix[0].length; // no. of column

        int i=0;

        while (i<m){

            if(matrix[i][0]<=target && matrix[i][n-1]>=target){
                int k=0;
                while(k<n){
                    if (matrix[i][k]==target)
                        return true;
                    k++;
                }
            }

            i++;
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
