package ex04_custom_exception;

public class Main {
  public static void main(String[] args) {
    try {
      // 사용자 정의 예외는 직접 만들어서 직접 전달(던지는 일)을 해야 한다.
      throw new MyException("내가만든예외", 1000);
    } catch (MyException e) {
      System.err.println(e.getMessage());
      System.err.println(e.getErrorCode()); // 여기서 다형성이 나온다. 상속관계 부분
    }
  }

}
