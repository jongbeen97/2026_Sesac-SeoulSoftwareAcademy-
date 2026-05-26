package ex05_constructor;

public class Main {
  public static void main(String[] args) {
    // 객체 생성시 생성자가 호출이 된다
    // 객체마다 다른 값을 배정을 할 때 필드를 사용한다.
    // 객체 생성 시점에 모델명을 적는다
    Car myCar = new Car("5시리즈");
    Car momCar = new Car("7시리즈");
    Car dadCar = new Car();

    System.out.println(myCar.model);
    System.out.println(momCar.model);
    System.out.println(dadCar.model);
  }

}
