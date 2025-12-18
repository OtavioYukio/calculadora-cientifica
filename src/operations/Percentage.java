package operations;

public class Percentage implements Operations {
    public double execute(double a, double b) {
        return a * b / 100;
    }

    public String name() {
        return "%";
    }
}
