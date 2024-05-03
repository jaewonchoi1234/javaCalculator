public class DivideOperator<T extends Number> implements Operator<T> {
    public double operate (T a, T b) {
        if (b.equals(0)) {
            throw new ArithmeticException("0으로 나눌수 없습니다.");
        }
        return a.doubleValue() / b.doubleValue();
    }
}
