package operations;

public class Exponenciation implements Operations {
    public double execute(double a, double b) {
        return Math.pow(a, b);
    }

    public String name() {
        return "^";
    }
}
