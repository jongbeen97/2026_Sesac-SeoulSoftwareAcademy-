package ex03_throws;

public class Calculator {

  // 메서드들의 예외를 회피하는 예제 

  /**
   * 
   * @param a
   * @param b
   * @throws NumberFormatException 어떤 경우 예외 발생(예외사유 작성)
   */
  public static void div(String a, String b) throws NumberFormatException{
    int x = Integer.parseInt(a); // String a 를 int x로 변경 
    int y = Integer.parseInt(b); 
    System.out.println("나누기(몫) : " + (x/y));
  }
  public static void mod(String a, String b){ // 실행 예외는 throws생략이 가능하다.s가 꼭 있어야 한다 문법이 다르니 
    int x = Integer.parseInt(a); // String a 를 int x로 변경 
    int y = Integer.parseInt(b); 
    System.out.println("나머지 : " + (x%y));
  }
}
