package ex01_class;

public class Main {
  public static void main(String[] args) {
    // class는 곧 타입이다 

    // 클래스를 타입으로 가지는 변수는 "객체이다 "

    // int a; // 변수 
    // Car b; // 객체 

    /*
    객체 사용 방법 
    */

    /*
    패키지 명시를 안해도 되는 3가지 경우 
    1. 같은 패키지에 있는 경우 
    2. java.lang 패키지에 있는 경우 (자바 설계 당시 약속 ,자바의 가장 기본 패키지, String,System 등 )
    3. import 문을 작성한 경우 ( 사실상 패키지 명시를 한 것이다 , 미리)
    */

    //객체 선언 
    ex01_class.Car car;

    // 객체 생성 ( 동적 할당을 통해 만든다)
    car = new Car();

    // 확인 
    System.out.println(car);

    // 객체의 값을 참조 
    car.model = "G80";
    car.price = 8000;

    System.out.println(car.model);
    System.out.println(car.price);

  }

}
