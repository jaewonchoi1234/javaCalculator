import java.util.*;

public class APP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstInt = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondInt = sc.nextInt();


        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch(operator) {
            case '+':
                result = firstInt + secondInt;
                break;
            case '-':
                result = firstInt - secondInt;
                break;
            case '*':
                result = firstInt * secondInt;
                break;
            case '/':
                if (secondInt == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstInt / secondInt;
                }
                break;
            default:
                System.out.println("사칙연산 기호가 아닙니다.(+,-,*,/)");
        }
        System.out.println("결과: " + result);
    }
}