package ex01_extends;
// 개발자는 사람이다 (Is-a관계)
// 개발자는 사람을 상속받을 수 있다. 

// 부모가 먼저 태어나야 자식이 태어날 수 있다. 
//자식 생성자는 부모 생성자를 먼저 호출해야 한다 

// super키워드를 통해 부모 생성자 호출 : super() : 부모 생성자 호출하는 코드
public class Developer extends Person {
  // Person을 상속 받은 developer 
  // Developer 는 Person 의 맴버를 내 것 처럼 다룰 수 있다. 
  
  
  private String skill; // developer의 필드 

  public Developer(String name, String skill){
    super(name);
    this.skill = skill;
  }

  // 부모 : person(상위클래스, 슈퍼클래스)
  // 자식 클래스 : Developer (하위 클래스, sub 클래스)
  void develop(){
    System.out.println("개발하기");
  }

  
}
