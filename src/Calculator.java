import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {
    //게산 결과 저장 할 ArrayList
    private ArrayList<Double> resultList;
    private ArrayList<Double> circleList;

    //pi값은 변하지 않는 상수여서 final를 붙이고 각 인스턴스들이 공유해서 사용하면 되기 때문에 static을 붙인다
    final static double pi = 3.14;

    //생성자
    public Calculator() {
        resultList = new ArrayList<>();
        circleList = new ArrayList<>();
    }

    //원 넓이 계산
    public double calculateCircleArea(int radius) {
        double circleArea;
        circleArea= pi*radius*radius;
        return circleArea;
    }
    //원 넓이 getter
    public ArrayList<Double> cirGetter(ArrayList<Double> list) {
        list.clear();
        for(Double c : circleList){
            list.add(c);
        }
        return list;
    }
    //원 넓이 setter
    public void cirSetter(ArrayList<Double> list){
        circleList.clear();
        for(Double d : list){
            circleList.add(d);
        }
        list.clear();
    }
    //원 넑이 inquiry
    public void cirInquiry() {
        int count = 1;
        System.out.println("[원 넑이 결과 리스트]");
        for(Double d : circleList){
            System.out.println(count++ +"번째 결과: "+d);
        }
    }

    //사칙연산
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
        list.clear();
    }

    //remover
    public void removeResult(){
        resultList.removeFirst();
    }

    //inquiry
    public void inquiryResults() {
        int number = 1;
        System.out.println("[사칙연산 결과 리스트]");
        for (Double d : resultList) {
            System.out.println(number++ +"번째 결과: "+d);
        }
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
