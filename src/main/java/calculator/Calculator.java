package calculator;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    ArrayList<Integer> result = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {
        Scanner sc = new Scanner(System.in);

        operator = sc.next().charAt(0); // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.

        int result = 0;

        System.out.println("첫 번째 숫자를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        num2 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        if (operator == '+') {
            result = num1 + num2;
        }else if (operator == '-') {
            result = num1 - num2;
        }else if (operator == '*') {
            result = num1 * num2;
        }else if (operator == '/') {
            if (num2 == 0) {
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }else{
                result = num1 / num2;
            }
        }else {
            throw new UnsupportedOperationException("올바르지 않은 사칙연산 기호입니다.");
        }

        return result;
    }
}
