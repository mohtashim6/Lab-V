public class matrixAddition {
    int[][] matrix1;
    int[][] matrix2;

        matrixAddition(int[][] m1, int[][] m2){
            matrix1=m1;
            matrix2=m2;
        }

        int[][] addition (int rows , int cols , int[][] m1 , int[][] m2){
            int[][] m3= new int[rows][cols];

            for (int i=0;i<m1.length;i++){
                for (int j=0;j<m1[0].length;j++){
                    m3[i][j]=m1[i][j]+m2[i][j];
                }
            }

                        return  m3;
        }
        void printArray(int [][] w){
            for (int i=0;i<w.length;i++){
                    for (int j=0;j<w[0].length;j++){
                        System.out.print(w[i][j] + " ");
                    }
                    System.out.println();
              }

            }
}
