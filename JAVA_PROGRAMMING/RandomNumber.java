import java.util.Random;

class RandomGenerator { // Renamed to RandomGenerator
    void gen() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(100) + 1);
        }
    }
}

public class RandomNumber {
    public static void main(String[] args) {
        RandomGenerator obj = new RandomGenerator();
        obj.gen();
    }
}