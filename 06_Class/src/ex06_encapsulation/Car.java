package ex06_encapsulation;

public class Car {

  //default 필드 선언 
  private String model;
  private int price;

  //메서드 정의(만들기)
  // 인자 받아서 필드에 저장하기 : Setter
    // 누구나 이 메서드를 호출할 수 있다. 
  public void setModel(String model){
    this.model = model;
  }
  public void setPrice(int price){
    this.price = price;
  }


  // 필드에 저장된 값을 반환하기 : Getter
  public String getModel(){
    return model;
  }

  public int getPrice(){
    return price;
  }

}
