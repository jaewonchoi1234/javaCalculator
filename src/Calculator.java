import java.util.ArrayList;

public class Calculator {
    //게산 결과 저장 할 ArrayList
    private ArrayList<Double> resultList = new ArrayList<>();

    //Getter
    public ArrayList<Double> getter(ArrayList<Double> list){
        list.clear();
        for(Double d : resultList){
            list.add(d);
        }
        return list;
    }

    //Setter
    public void setter(ArrayList<Double> list){
        resultList.clear();
        for(Double d : list){
            resultList.add(d);
        }

    }
    //remover
    public void removeResult(){
        resultList.removeFirst();
    }

    //사칙연산을 수행하고 값을 반환하는 메서드
    public double calculate (int firstNum,int secondNum,char operator) throws ArithmeticException, IllegalArgumentException {
        double result;
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    throw new ArithmeticException("0으로 나누기를 할 수 없습니다.");
                }
                result = (double) firstNum / secondNum;
                break;
            default:
                throw new IllegalArgumentException("입력한 기호가 사칙연산 기호가 아닙니다.");
        }
        return result;
    }

}
