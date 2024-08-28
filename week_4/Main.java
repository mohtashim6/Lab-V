import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 1 for finding smallest and largest in an array");
        System.out.println("choose 2 for matrix addtition");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("enter the size of the array!");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("enter the " + (i + 1) + " element of the array");
                arr[i] = sc.nextInt();
            }
            array a1 = new array(arr);
            System.out.println("the largest element of the array is " + a1.max());
            System.out.println("the smallest element of the array is " + a1.min());
            System.out.println("the sum of the element of the array is "+ a1.sum(arr));
            float avg= (float) a1.sum(arr) /arr.length;
            System.out.println("the average of the element of the array is "+ avg);
        } else if (choose == 2) {

            System.out.println("enter the number of rows in matrix");
            int rows = sc.nextInt();
            System.out.println("enter the column of the matrix");
            int cols = sc.nextInt();
            int[][] arr1 = new int[rows][cols];
            int[][] arr2 = new int[rows][cols];
            System.out.println("enter the elements of the matrix 1");
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < cols; j++) {
                    // System.out.println("enter the " +i +","+j+ "element of the array0");
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter the element of the matrix 2");

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < cols; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            matrixAddition m1 = new matrixAddition(arr1, arr2);
            m1.printArray(m1.addition(rows,cols,arr1,arr2));

        }

    }
}