package ex02_parameter;
/**
 * 함수 만들기 
 * 함수 : 특정 기능을 수행하는 코드 블록 
 * 결과타입(Output) 함수명(전달값,인자값,★매개변수-input) {}
 * 함수의 실행 결과가 어떤 값으로 치환되지 않음. 기능 수행만하고 값을 최종 결과로 내지 않는 형태가 결과 타입이 없다고 표현합니다. = void
 */
public class Car {

  // 결과타입 함수 ( 매개변수){}

  // 값 (이를 메서드에서는 변수를 : 필드값 이라고 부른다. 이를 다루기 위해서 메서드를 쓴다)
  int oil;


  /**
   * 메서드 : 특정 기능을 수행하는 코드 블록(함수).
   * @param city 뭘 받는지 설명을 작성합니다.
   * class 가 없다면 함수 / class가 있다면 Method
   * 인자 : 메서드에 전달하는 값 (Argument)
   * 매개변수 (Parameter) : 인자를 전달 받는 변수 
   */
  void drive (String city){//파라미터,매개변수
    //비즈니스로직 
    oil -= 10; // 자동차가 가지고 있는 값의 오일을 10정도 차감한다! 
    System.out.println(city + "에서 drive하기");
  }

  void goToGasStation(int fuel){
    //비즈니스로직
    oil += fuel;
    System.out.println("현재 연료량 : "+oil);
  }

}
