
// Class to generate the required sequence
class SequenceGenerator {
    // Method to generate Fibonacci number at position n
    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Method to print the sequence up to a given limit
    public void printSequence(int limit) {
        System.out.println("Generated sequence up to " + limit + " terms:");
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                System.out.print(fibonacci(i / 2) + " "); // Fibonacci numbers at even indices
            } else {
                System.out.print(-(3 * (i / 2) + 1) + " "); // Negative decreasing numbers at odd indices
            }
        }
        System.out.println();
    }
}

// Main class to execute the program
 class limit {
    public static void main(String[] args) {
        SequenceGenerator generator = new SequenceGenerator();
        generator.printSequence(15); // Change the limit as needed
    }
}
