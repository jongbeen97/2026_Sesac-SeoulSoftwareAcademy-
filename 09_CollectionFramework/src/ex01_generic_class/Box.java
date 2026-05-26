package ex01_generic_class;

// 제네릭 클래스 : 정해지지 않은 타입 T를 사용합니다. <- 객체 생성 시점에 정해지는 것 ( 구체화 )
public class Box<T > { // 타입을 4개 받아서 생성하겟다는 의미이다. 2개 이상은 볼 일이 없을 것이다. <T,A,B,C>

  // 필드 
  private T content;

  // Getter / Setter 자동생성 
  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  

}
