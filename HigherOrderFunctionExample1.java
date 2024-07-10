import java.util.function.Function;

public class HigherOrderFunctionExample1 {
    public static void main(String[] args) {
        Function<Double, Double> half = a -> a / 2;
        System.out.println(applyFunction(10.0, half)); // Output: 5.0
    }

    public static Double applyFunction(Double a, Function<Double, Double> function) {
        return function.apply(a);
    }
}
