import java.util.*;

public class APP {
    public static void main(String[] args) {
        //10개의 결과값 저장하는 배열 생성 및 배열 조회를 위한 index변수 생성
        int[] resultArray = new int[10];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            //첫번째 숫자와 두번째 숫자 int값으로 키보드에서 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstInt = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondInt = sc.nextInt();
            //next를 사용해서 기호를 문자열로 받고 첫문자를 선택해서 문자형 변수에 저장
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            //operator 변수의 기호에 따라 switch문으로 사칙연산 수행
            int result = 0;
            switch(operator) {
                case '+':
                    result = firstInt + secondInt;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = firstInt - secondInt;
                    System.out.println("결과: " + result);
                    break;
                case '*':
                    result = firstInt * secondInt;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    //0으로 나눌 경우 계산을 수행하지 않음
                    if (secondInt == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = firstInt / secondInt;
                        System.out.println("결과: " + result);
                    }
                    break;
                default:
                    System.out.println("사칙연산 기호가 아닙니다.(+,-,*,/)");
            }

            if (index == 10) {
                for (int i = 0 ; i <9; i++){
                    resultArray[i] = resultArray[i+1];
                }
                resultArray[9] = result;
            } else {
                resultArray[index++] = result;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }

        }
    }
}