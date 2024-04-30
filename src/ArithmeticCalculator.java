
public class ArithmeticCalculator extends Calculator {
    AddOperator add = new AddOperator();
    SubtractOperator sub = new SubtractOperator();
    MultiplyOperator mul = new MultiplyOperator();
    DivideOperator div = new DivideOperator();

    public ArithmeticCalculator() {
        add = new AddOperator();
        sub = new SubtractOperator();
        mul = new MultiplyOperator();
        div = new DivideOperator();
    }

    public double calculate (int firstNum,int secondNum,char operator) throws ArithmeticException, IllegalArgumentException {
        double result;
        switch (operator) {
            case '+':
                result=add.operate(firstNum,secondNum);
                break;
            case '-':
                result=sub.operate(firstNum,secondNum);
                break;
            case '*':
                result=mul.operate(firstNum,secondNum);
                break;
            case '/':
                if (secondNum == 0) {
                    throw new ArithmeticException("0으로 나누기를 할 수 없습니다.");
                }
                result=div.operate(firstNum,secondNum);
                break;
            default:
                throw new IllegalArgumentException("입력한 기호가 사칙연산 기호가 아닙니다.");
        }
        return result;
    }
}