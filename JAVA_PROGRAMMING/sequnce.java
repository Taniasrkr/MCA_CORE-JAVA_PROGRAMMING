 class Sequence {
    // Method to compute factorial of a number
    public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

 
    public void printSequence(int limit) {
        System.out.println("Generated sequence up to " + limit + " terms:");
        int num = 2; // Start with 2 for even indices

        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                System.out.print(num + " "); // Even index: Print even number
            } else {
                System.out.print(factorial(num) + " "); // Odd index: Print factorial of previous even number
                num += 2; // Increment even number
            }
        }
        System.out.println();
    }
}


 class MainSequence {
    public static void main(String[] args) {
        Sequence generator = new Sequence();
        generator.printSequence(10); // Change limit as needed
    }
}
