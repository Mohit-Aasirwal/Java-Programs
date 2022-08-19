public class Transpose_of_matrix {
    public static void main(String[] args) {
              int[][] matrix ={
                      {1,2,3},
                      {4,5,6},
                      {7,8,9}
              };
              int i,j=0;
                for( i =0; i<matrix.length;i++){
                    for( j =0; j<matrix[i].length;j++){
                        int temp =i;
                        i=j;
                        j=temp;
                    }
                }
        System.out.println(matrix[i][j]);

            }
        }

