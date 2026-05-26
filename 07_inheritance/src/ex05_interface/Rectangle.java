package ex05_interface;

public class Rectangle implements Shape {
  //필드
  private double width;
  private double height;

  // 생성자 생성
  public Rectangle(double width,double height){
    this.width = width;
    this.height = height;
  }

  // 메서드 
  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return width*height;
  }

  @Override
  public double getPerimeter() {
    // TODO Auto-generated method stub
    return 2*(width+height);
  }

}
