package operations;

public class Logarithm implements Operations {
    public double execute(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Base and value must be positive.");
        }
        return Math.log(b) / Math.log(a);
    }

    public String name() {
        return "log";
    }
}
