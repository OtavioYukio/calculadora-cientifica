package operations;

public class Addition implements Operations{
    public double execute(double a, double b) {
        return a + b;
    }

    public String name() {
        return "+";
    }
}
