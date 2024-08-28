import java.util.Scanner;

public class matrixMultiplication {
    static int[][] mM(int[][] m1,int[][] m2,int rows,int cols){
        int[][] m3 = new int[rows][cols];
        for (int i=0;i< m1.length;i++){
            for(int j=0;j<m2[0].length;j++){
                for (int k=0;k<m1[0].length;k++){
                    m3[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return m3;
    }
   static void printArray(int[][] w){
        for (int i=0;i<w.length;i++){
            for (int j=0;j<w[0].length;j++){
                System.out.print(w[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows of the first matrix");
        int rows = sc.nextInt();
        System.out.println("enter the column of the first matrix");
        int cols = sc.nextInt();
        int[][] arr1 = new int[rows][cols];
        System.out.println("enter the rows of the second matrix");
        int row2=sc.nextInt();
        System.out.println("enter the column of the second matrix");
        int cols2 = sc.nextInt();
        int[][] arr2 = new int[row2][cols2];
        if(cols!=row2) System.out.println("matrix cant be multiplied as row nd column doesn't match");
        else {
            System.out.println("enter the elements of the matrix 1");
            for (int i = 0; i < arr1.length; i++) {

                for (int j = 0; j < arr1[0].length; j++) {
                    // System.out.println("enter the " +i +","+j+ "element of the array0");
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter the element of the matrix 2");

            for (int i = 0; i <arr2.length; i++) {

                for (int j = 0; j < arr2[0].length; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            printArray(mM(arr1, arr2, rows, cols));
        }

    }
}
