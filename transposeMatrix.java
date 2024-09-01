import java.util.Scanner;

public class transposeMatrix {
    public static int[][] tm(int[][] a){
        int [][] m2 = new int[a[0].length][a.length];
        for (int i =0 ; i<a[0].length;i++){
            for (int j=0;j<a.length;j++){
                m2[i][j]=a[j][i];
            }
        }


        return m2;
    }
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        System.out.println("enter the rows of the matrix");
        int rows = sc.nextInt();
        System.out.println("enter the cols of the matrix");
        int cols = sc.nextInt();
        int[][] m1= new int[rows][cols];
        System.out.println("enter the element of the matrix");
        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        printArray(tm(m1));

    }
}
