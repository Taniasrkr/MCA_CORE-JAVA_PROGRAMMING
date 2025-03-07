class GCDCalculator {
    
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // GCD found
    }
}

 class GCD {
    public static void main(String[] args) {
        int num1 = 6, num2 = 8; 
        GCDCalculator ob1 = new GCDCalculator();

        int gcd = ob1.findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
