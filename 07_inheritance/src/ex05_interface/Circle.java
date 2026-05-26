package ex05_interface;

// 인터페이스 Shape을 구현하는 클래스 : 구현체
public class Circle implements Shape {

  // 필드 생성
  private double radius; // 반지름

  // 생성자 생성 
  public Circle(double radius){
    this.radius = radius;
  }

  // 메서드 구현 
  // 인터페이스 구현체는 반드시 모든 추상 메서드를 오버라이드 해야 합니다. 
  @Override
  public double getPerimeter() {
    // TODO Auto-generated method stub
    return Math.PI * radius *radius;
  }
  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return 2*Math.PI *radius;
  }
}
