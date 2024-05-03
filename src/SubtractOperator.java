public class SubtractOperator<T extends Number> implements Operator<T> {
    public double operate(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}
