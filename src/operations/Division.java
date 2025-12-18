package operations;

public class Division implements Operations {
    public double execute(double a, double b) {
        return a / b;
    }

    public String name() {
        return "/";
    }
}
