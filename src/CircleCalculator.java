
public class CircleCalculator extends Calculator {
    //pi값은 변하지 않는 상수여서 final를 붙이고 각 인스턴스들이 공유해서 사용하면 되기 때문에 static을 붙인다
    final static double pi = 3.14;

    //원 넓이 계산
    public double calculate(int radius) {
        double circleArea;
        circleArea= pi*radius*radius;
        return circleArea;
    }
}