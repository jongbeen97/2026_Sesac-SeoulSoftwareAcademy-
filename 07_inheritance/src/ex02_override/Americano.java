package ex02_override;

public class Americano extends Espresso {
  public Americano(String coffeeBean){
    super(coffeeBean);
  }

  // 부모가 가진 메서드를 자식이 사용할 수 없는 경우 , 
  // 해당 메서드를 다시 만들면 된다. ( 재정의를 하면 됨 )
  // 메서드 오버라이드 한다( 메서드 재정의, 덮어쓰기 )
  
  // 똑같이 만들 것 ( 접근 제한자 제외 )
  // override한 메서드 라고 알릴 것 
  @Override
  public void taste(){
    System.out.println("덜 쓴맛");
  }
}
