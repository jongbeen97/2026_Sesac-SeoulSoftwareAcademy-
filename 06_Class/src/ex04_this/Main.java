package ex04_this;

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car(); // 객체 생성 , 
    myCar.addOil(-50); // 객체 메서드 호출 (음수인 경우 실행이 안됨.)
    myCar.addOil(30);// 객체 메서드 호출
    System.out.println(myCar.oil);
  }

}
