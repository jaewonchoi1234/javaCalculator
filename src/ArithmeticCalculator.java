import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {


    public double calculate (int firstNum,int secondNum,char operator) throws ArithmeticException, IllegalArgumentException {
        return operatorFactory(operator).operate(firstNum,secondNum);
    }

    private Operator operatorFactory(char operator) {
        OperatorType operatorType = OperatorType.getOperatorType(operator);
         return switch (operatorType) {
             case ADD -> new AddOperator();
             case SUBSTRACT -> new SubtractOperator();
             case MULITPLY -> new MultiplyOperator();
             case DIVIDE -> new DivideOperator();
             case MOD -> new ModOperator();
         };
    }


    public void inquiryResults() {
        int number = 1;
        System.out.println("[사칙연산 결과 리스트]");
        for (Double d : super.getter()) {
            System.out.println(number++ +"번째 결과: "+d);
        }
    }
}