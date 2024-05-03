import java.lang.reflect.Array;
import java.util.*;

public class APP {
    public static void main(String[] args) {
        //계산 담당 클래스 선언 및 생성
        Calculator cal;
        Calculator arithmeticCalculator = new ArithmeticCalculator();
        Calculator circleCal = new CircleCalculator();

        //getter setter 깊은 복사용
        ArrayList<Double> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        //while문
        int firstInt;
        int secondInt;
        char operator;
        int radius;

        while (true) {
            System.out.println("다음 중 계산할 것을 선택하세요");
            System.out.println("1.사칙연산 2.원 넑이 계산");
            char num = sc.next().charAt(0);
            if (num == '1') {
                //사칙연산 계산기로 초기화
                cal = arithmeticCalculator;
                //첫번째 정수, 두번째 정수, 연산자 키보드에서 입력받기
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    firstInt = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    secondInt = sc.nextInt();
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    operator = sc.next().charAt(0);
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                    sc.next();
                    continue;
                }

                //calculate 메서드에서 예외 발생 시 예외 처리로 예외 메시지 출력
                try {
                    //Calculate 인스턴스의 calculate로 사칙연산 수행 후 반환\
                    double result = ((ArithmeticCalculator)cal).calculate(firstInt, secondInt, operator);
                    System.out.println("결과: " + result);
                    ///저장 된 컬렉션 가져와서 결과 추가 후 다시 저장
                    list=cal.getter(list);
                    list.add(result);
                    cal.setter(list);
                    list.clear();
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    continue;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
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

            } else if (num == '2') {
                //원 넓이 계산기로 바꿈
                cal = circleCal;

                //반지름 입력
                try {
                    System.out.print("반지름을 입력하세요: ");
                    radius = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                    sc.next();
                    continue;
                }
                //원 넓이 계산
                double area = ((CircleCalculator)cal).calculate(radius);
                System.out.println("결과: " + area);
                //원 넓이 저장
                list=cal.getter(list);
                list.add(area);
                cal.setter(list);
                list.clear();

            } else {
                System.out.println("1또는 2를 입력하세요.");
                continue;
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