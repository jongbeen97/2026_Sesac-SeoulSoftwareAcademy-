package ex01_generic_class;

public class Main {
  public static void main(String[] args) {
    // 타입을 결정을 한 뒤에 객체를 생성한다. 
    Box<String> sBox = new Box<>(); // 타입, 객체 생성시 타입을 같이 !! , 하지만 최신 버전은 <String>이 생략이 가능하다. 

    // String 으로 타입이 결정된 이후에는 문법적으로 String만 지원함. 
    sBox.setContent("Hello");
    System.out.println(sBox.getContent());
    
    // 제네릭 타입은 오직 참조 타입만 가능하다 ( 기본 값이 필요한 경우에는 Wrapper Class 사용을 해야 한다. )
    Box<Integer> iBox = new Box<>();
    iBox.setContent(10);
    System.out.println(iBox.getContent());
  }

}
