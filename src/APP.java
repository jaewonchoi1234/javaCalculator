import java.lang.reflect.Array;
import java.util.*;

public class APP {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

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

                System.out.println("결과: " + result);
                ///컬렉션에 결과 값 저장
                list.add(result);
                cal.setter(list);
            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }

            //remove문자열을 입력받으면 저장한 결과의 0번째 값을 삭제함
            System.out.println("가장 먼저 연산 된 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String rmAnswer = sc.next();
            try {
                if (rmAnswer.equals("remove")) {
                    cal.removeResult();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            //inquiry문자열 입력받으면 저장된 연산결과를 조회함.
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryAnswer = sc.next();
            if (inquiryAnswer.equals("inquiry")) {
                cal.inquiryResults();
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