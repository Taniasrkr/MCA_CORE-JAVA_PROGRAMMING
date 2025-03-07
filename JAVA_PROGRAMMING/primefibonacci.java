
class PrimeFibonacci {
    
    public boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    public void printPrimeFibonacci() {
        int first = 0, second = 1, count = 0;
        System.out.println("First 8 prime numbers in Fibonacci sequence:");

        while (count < 8) {
            int next = first + second;
            first = second;
            second = next;

            if (isPrime(next)) {
                System.out.println(next + " ");
                count++;
            }
        }
        System.out.println();
    }

    
    public void printFirstPrimes() {
        int num = 2, count = 0;
        System.out.println("First 8 prime numbers:");

        while (count < 8) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}

// Main class to execute the program
 class prime {
    public static void main(String[] args) {
        PrimeFibonacci ob1 = new PrimeFibonacci();
        ob1.printFirstPrimes(); 
        ob1.printPrimeFibonacci(); 
    }
}
