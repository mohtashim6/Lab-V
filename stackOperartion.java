import java.sql.SQLOutput;
import java.util.Scanner;

class stack{
    int Top=-1;
    int[] arr;
    stack(){
        arr = new int[100];
    }
    void push(int e){
      arr[Top+1]=e;
        Top++;
        System.out.println(   e   +   " is pushed in the stack");

    }
    void pop(){
        if (Top==-1) System.out.println("stack is empty operation cant be performed");
        else {
            System.out.println(arr[Top] + "  is deleted from the stack");
            Top--;
        }
    }
    int printArray(){
        for(int i=0;i<=Top;i++){
            System.out.print( arr[i] + " ");

        }
         return 0;
    }
}
public class stackOperartion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s1 = new stack();
        System.out.println("choose 1 for push and 2 for pop");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("enter the element that you want to push in the stack");
            int e = sc.nextInt();
            s1.push(e);
        }
        System.out.println();
        if (n==2){
            s1.pop();
            System.out.println("stack after pop operation is " + s1.printArray());
        }
    }
}
