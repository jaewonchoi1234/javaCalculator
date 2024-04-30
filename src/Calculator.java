import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Calculator {
    //게산 결과 저장 할 ArrayList
    private ArrayList<Double> resultList;

    //생성자
    public Calculator() {
        resultList = new ArrayList<>();
    }

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
}
