package ex04_this;

public class Car {

  // this
  // 전반적인 의미 : 현재 클래스로 만든 객체를 의미
  // 2가지 활용 
  /* 
  1. 필드와 매개변수 구분하기 ( 필드는 this 붙여서 적기)
  2. 다른 생성자 호출시에 활용됨.
  */

  int oil;

  void addOil(int oil){
    if(oil < 0){
      return ;
    } // 만약에 음수 값이 들어온 경우 밑의 코드를 실행하지 않도록 실행하는 것.
    this.oil += oil; // 
  }


}
