package ex01_lambda;

public class Main {
  public static void main(String[] args) {
    
    MyInterface my = ()-> System.out.println("나의 첫 람다식");
    my.method();

    MyInterface2 my2 = (name) -> System.out.println(name+"입니다.");
    my2.method("길동이");
  

  MyInterface3 my3 = () ->  "김철수";
  System.out.println("반환값 : "+ my3.method());

  Calculator cal = (a,b) -> a+b;
  System.out.println(cal.add(3, 5));

}

}
