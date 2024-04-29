import java.util.*;

public class APP {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);


        while (true) {
            //첫번째 정수, 두번째 정수, 연산자 키보드에서 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstInt = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondInt = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);



            //calculate 메서드에서 예외 발생 시 예외 처리로 예외 메시지 출력
            try {
                //Calculate 인스턴스의 calculate로 사칙연산 수행 후 반환
                double result = cal.calculate(firstInt, secondInt, operator);
                //Getter 와 Setter 활용
                cal.setter(result); //컬렉션에 결과 저장
                System.out.println(cal.getter()); //컬렉션에서 최신 결과 가져오기
            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }


            //exit문자열을 입력받으면 while(1)루프를 빠져나옴
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }



        }
    }
}