package operations;

public class Sine implements UnaryOperations {
    public double execute(double a) {
        return Math.sin(a);
    }

    public String name() {
        return "sin";
    }
}
