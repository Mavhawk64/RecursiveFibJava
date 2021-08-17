import java.util.*;
public class FibonacciSequence {
    public static void main(String args[]) {
        System.out.println("Welcome to my Fibonacci Sequence!\nHow many numbers would you like?");
        int myInputNum = (new Scanner(System.in)).nextInt();
        for(int i = 0; i < myInputNum; i++) {
            System.out.println(fibNum(i));
        }
    }
    
    private static int fibNum(int n) {
        if(n < 2) return 1;
        return fibNum(n - 1) + fibNum(n - 2);
    } 
}
