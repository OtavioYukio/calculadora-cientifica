package operations;

public class Tangent implements UnaryOperations {
    public double execute(double a) {
        return Math.tan(a);
    }

    public String name() {
        return "tan";
    }
}
