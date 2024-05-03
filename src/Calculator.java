import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Calculator {
    //게산 결과 저장 할 ArrayList
    private ArrayList<Double> resultList;

    //생성자
    public Calculator() {
        this.resultList = new ArrayList<>();
    }

    //Getter
    public ArrayList<Double> getter(ArrayList<Double> list){
        for(Double d : resultList){
            list.add(d);
        }
        return list;
    }
    protected ArrayList<Double> getter(){
        return resultList;
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
    //inquiry
    abstract void inquiryResults();
}
