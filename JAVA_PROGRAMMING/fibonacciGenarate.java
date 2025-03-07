class fibonacci {
    public int genatareFibonacci(int n){
        int a=0, b=1, sum =0;

        System.out.println(" A " + n + " Fibonacci numbers: ");

        for(int i=0;i<n;i++){
            System.out.println(a+ " ");
            sum += a;
            int next= a+b;
            a=b;
            b=next;

        }
        System.out.println("\n Sum of fibonacci numbers: "+ sum);
        return sum;
    }
}

public class fibonacciGenarate {
    public static void main(String[] args) {
        fibonacci ob1 = new fibonacci();
        ob1.genatareFibonacci(10);
    }
}