package ex01_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 사용자 입력을 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in); // 키보드로 부터 입력을 받겟다.

    // 정수 저장할 변수
    int a, b;// 변수 선언

    // 무한 루프
    while (true) {

      try {
        // 코드 작성하는 부분
        System.out.println("첫번째 숫자 입력");
        a = sc.nextInt();
        System.out.println("두번째 숫자 입력 :");
        b = sc.nextInt();

        System.out.println("몫: " + (a / b));
        System.out.println("나머지: " + (a % b));
      } catch (ArithmeticException e) {
        // 예외 처리 하는 부분
        // 주요 메서드 : getMessage(), [개발용]printStackTrace() : 어디서 문제 발생하는지 추적 ( 내가 보려고 )
        // System.err.println("예외 사유:"+e.getMessage());
        // System.err.println("0으로 나눌 수 없습니다. 다시 시도해주세요!");

        e.printStackTrace();
      } catch (InputMismatchException e) {
        System.out.println("정수만 입력 할수 있습니다");
      }

    }

  }
}
