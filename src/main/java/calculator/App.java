package calculator;


import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0); // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.

            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            }else if (operator == '-') {
                result = num1 - num2;
            }else if (operator == '*') {
                result = num1 * num2;
            }else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else{
                    result = num1 / num2;
                }
            }else {
                System.out.println("올바르지 않은 사칙연산 기호입니다.");
            }

            list.add(result);
            System.out.println("결과: " + result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();

            if (remove.equals("remove")) {
                list.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();

            if (inquiry.equals("inquiry")) {
                for(int results: list) {
                    System.out.println(results);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();

            /* String 문자열 비교할 때 '=='연산자는 주소를 비교하고 'equals()'연산자가 값을 비교 */
            if (exit.equals("exit")) {
                break;
            }

        }


    }
}
