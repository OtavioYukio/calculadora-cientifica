package operations;

public class Factorial implements UnaryOperations {
    public double execute(double a) {
        double res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public String name() {
        return "!";
    }
}
