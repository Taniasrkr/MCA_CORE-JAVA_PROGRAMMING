
class PrimeLimit {
    
    public boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    public void printPrimes(int limit) {
        System.out.println("Prime numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// Main class to execute the program
 class PrimeMain { 
    public static void main(String args[]) {
        PrimeLimit ob1 = new PrimeLimit();
        ob1.printPrimes(1000);
    }
}
    

