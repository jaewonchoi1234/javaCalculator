import java.util.*;

public class APP {
    public static void main(String[] args) {
        //arraylist로 바꿔서 무한이 저장할수 있게 변경
        ArrayList<Integer> resultArray = new ArrayList<Integer>();


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

            resultArray.add(result);
            //remove문자열을 입력받으면 resultArray의 0번째 값을 삭제함
            System.out.println("가장 먼저 연산 된 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String rmAnswer = sc.next();
            if (rmAnswer.equals("remove")) {
                resultArray.remove(0);
            }
            //inquiry문자열 입력받으면 저장된 연산결과를 조회함.
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryAnswer = sc.next();
            if (inquiryAnswer.equals("inquiry")) {
                int num = 1;
                for(Integer i : resultArray) {
                    System.out.println(num++ +"번째 결과값: "+i);
                }
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