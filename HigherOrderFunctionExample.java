import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class HigherOrderFunctionExample {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> multiplyBy = x -> y -> x * y;

        IntUnaryOperator timesTen = multiplyBy.apply(10);
        System.out.println(timesTen.applyAsInt(5)); // Output: 50
    }
}
