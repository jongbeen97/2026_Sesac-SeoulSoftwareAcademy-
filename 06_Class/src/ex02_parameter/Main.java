package ex02_parameter;

public class Main {
  public static void main(String[] args) {
    // 객체 선언 및 생성
    Car car = new Car();
    car.goToGasStation(70);

    // 마침표(.) 연산자 호출
    car.drive("속초");
    car.drive("강릉");
    car.drive("부산");
    car.drive("제주도");

    System.out.println("현재 연료량 : " + car.oil);
  }

}
