package ex04_abstract;

/*
다형성 : 하나의 타입으로 여러 객체를 관리하는 성질 

*/

public class Main {
  public static void main(String[] args) {

    // 업케스팅 : 자식 객체의 타입을 부모 타입으로 바꾸는 것 ( 자동으로 진행 )
    Coffee coffee1 = new Espresso("브라질");
    Coffee coffee2 = new Americano("니카라과");

    // 업케스팅 된 객체도 실제 메서드 실행시에는 자신의 메서드를 찾아서 실행한다. 
    coffee1.taste();
    coffee2.taste();

    coffee1.info();

    // Espresso 전용 메서드 호출을 위해서 Espresso 타입으로 강제 변환(Downcasting)
    // 타입이 맞는지 체크하는 것이 권장 사항 : 타입 체크 연산자 instanceof 사용
    //coffee1 객체가 Espresso 타입이 맞다면 , 타입을 변환하라 . 
    if (coffee1 instanceof Espresso){ // 맞다면 호출하도록 해주는 것 
      ((Espresso)coffee1).drink();
    }

    // 추상 클래스는 객체를 생성할 수 없다. 미완성 상태이기에
    // Coffee coffee3 = new Coffee("과테말라");

    // 미완성된 추상메서드를 만든다면 객체를 생성할 수 있다. 
    Coffee coffee3 = new Coffee("과테말라") {
      @Override
      public void taste() {
        // TODO Auto-generated method stub
        System.out.println("커피taste");
      }

    };
    coffee3.taste();
    coffee3.info();
  }
}
