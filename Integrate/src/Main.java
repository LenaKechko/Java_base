import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        int n = 10000000;
        double h = (b - a) / n;
        double I = 0;
        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            I += f.applyAsDouble(x);
        }
        I *= h;
        return I;
    }
}
