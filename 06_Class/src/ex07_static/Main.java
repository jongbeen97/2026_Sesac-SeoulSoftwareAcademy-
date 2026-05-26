package ex07_static;

public class Main {
  public static void main(String[] args) {
    // 객체 생성 없이 메서드 호출 

    System.out.println(Calcualtor.PI);

    // class로 메서드를 호출한다.
    // 객체로 호출하는 것은 객체 멤버라는 것. 동일한 용어 인스턴스 , 클래스 멤버 아니면 인스턴스 멤버 
    int result = Calcualtor.add(1, 2);
    System.out.println(result);

  }
}
