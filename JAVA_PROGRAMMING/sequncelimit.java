
import java.util.*;

class sequnce {
    void even(int n) {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print("Even and Fibonacci Series: ");
        for (i = 1; i <= n; i++) {

            System.out.print(n1 + ", " + (int) Math.pow(2, i) + ", ");

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
    }
}

class sequncelimit {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print Fibonacci and Even number: ");
        num = sc.nextInt();

        sequnce obj = new sequnce();
        obj.even(num);
    }
}
