
import java.util.Scanner;

class Power {
    int base, exp;

    Power(int b, int e) {
        base = b;
        exp = e;
    }

    void calPow() {
        int result = 1;
        while (exp > 0) {
            result *= base;
        }
        System.out.println(result);
    }
}

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        Power p = new Power(sc.nextInt(), sc.nextInt());
        p.calPow();
        sc.close();
    }
}