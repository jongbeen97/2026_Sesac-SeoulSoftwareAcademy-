package ex01_extends;

public class Doctor extends Person {

  private String hospital;// doctor의 필드 

  public Doctor(String name,String hospital){
    super(name);
    this.hospital=hospital;
  }

  void operate(){
    System.out.println("수술하기");
  }

}
