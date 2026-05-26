package ex03_polymorphism;

public class Coffee {
  private String coffeeBean;

  public Coffee(String coffeeBean){
    this.coffeeBean=coffeeBean;
  }

  // 자식 객체들이 호출할 수 있도록 taste Method를 추가해줍니다. 
  // 본문은 의미가 없다.
  public void taste(){

  }

  // 커피 정보 출력 메서드 
  public void info (){
    System.out.println("원산지" + coffeeBean);
  }


  
}
