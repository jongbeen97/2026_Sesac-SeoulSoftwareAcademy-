package ex03_throws;

public class Main {
  public static void main(String[] args) {
    // String a = "10.5";
    // String b = "3";

    try {

    String a = "10.5";
    String b = "3";
      Calculator.div(a, b);
    Calculator.mod(a, b);
    } catch (Exception e) {
      System.err.println(e.getMessage()); // 예외 상황 을 화면에 출력 
    }

    //Calculator.div(a, b);
    //Calculator.mod(a, b);
  }
}
