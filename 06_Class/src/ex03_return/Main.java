package ex03_return;

public class Main {
  //main 메서드 만들기 
  public static void main(String[] args) {
    // 객체 생성
    Calculator calc = new Calculator();
    // 객체로 메서드 호출 
   int result = calc.add(3, 5);
    System.out.println(result);
    System.out.println(calc.add(3,8));

    calc.add(-1.5, 1.5);
  }
}
