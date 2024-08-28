import java.util.Scanner;

public class bubbleSort {
    static int[] sorting(int[] a){
        boolean swap ;
        int n = a.length;
        for (int i=0;i<a.length;i++){
            swap = false;
            for (int j=(i+1);j<n;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        return a;
    }
    static void printArray(int [] w){

        for(int i=0;i<w.length;i++)
        {
            System.out.println(w[i]);
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i< arr.length;i++){
            System.out.println("enter the " +(i+1) + " element of the array");
            arr[i] = sc.nextInt();
        }

        printArray(sorting(arr));
    }
}
