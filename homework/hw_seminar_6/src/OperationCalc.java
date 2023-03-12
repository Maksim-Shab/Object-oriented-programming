import java.util.Objects;

public interface OperationCalc {
    public static double arithmeticOperation(double x, String operation, double y) {
        double result;
        if (Objects.equals(operation, "+")) {
            result = x + y;
            return result;
        } else if (Objects.equals(operation, "-")) {
            result = x - y;
            return result;
        } else if (Objects.equals(operation, "*")) {
            result = x * y;
            return result;
        } else if (Objects.equals(operation, "/")) {
            result = x / y;
            return result;
        } else {
            return  0;
        }
    }
}
