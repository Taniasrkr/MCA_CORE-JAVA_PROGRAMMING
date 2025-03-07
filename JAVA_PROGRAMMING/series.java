
class Series {
       public double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public double computeSeriesSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / factorial(i);
        }
        return sum;
    }
}

 class mainSeries {
    public static void main(String[] args) {
        int n = 5; 
        Series calculator = new Series();

        double sum = calculator.computeSeriesSum(n);
        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
}
