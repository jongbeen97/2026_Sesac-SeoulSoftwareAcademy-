package ex02_parameter;

class Main1 {
  public static void main(String[] args) {
    // 클래스 타입 객체명 ;
    Calculator myCalc;
    myCalc = new Calculator(); // 메모리 할당을 받음 , 객체의 인스턴스 생김
    // 배열 만들기
    int[] arr = {1,2,3,4,5}; //신입개발자 st

    myCalc.add(1, 1);
    myCalc.add(1.5, 2.5);
    System.out.println("===배열 덧셈===");
    myCalc.add(arr);
    myCalc.add(new int[] {1,2,3,4,5,6,7,8,9,10}); //동적 초기화 방법을 사용한 방법 
    System.out.println("===곱셈====");
    myCalc.multiply(1,2);
    myCalc.multiply(1,2,3,4,5,6,7,8,9);
  }
}

public class Calculator {

  // 메서드 오버로딩 (Overloading)
  // 같은 이름의 메서드가 있고 갯수나 타입이 다른 매개변수가 있을 때 두 메서드는 오버로딩 되었다고 볼 수 있다.

  void add(int a, int b) {
    System.out.println(a + b);
  }

  void add(double a, double b) {
    System.out.println(a + b);
  }
// 이거는 안 쓸 것
  // void multiply(int a, int b){
  //   System.out.println(a*b);
  // }
// 이거도 안쓸 것
  // void multiply(int a,int b,int c){
  //   System.out.println(a*b*c);
  // }
  //가변인자 , 인자 갯수가 정해지지 않은 경우 , 가변인자 처리를 위해 말줄임표(...)
  void multiply(int a,int b,int... numbers){
  // 가변인자는 실제로 배열로 처리된다. 이는 반복문으로 처리를 한다.
  int result = a*b;
  for (int n : numbers){
    result *= n;
  }
  System.out.println(result);
  }
  
  void add(int[] numbers){
    //덧셈결과 초기화 
     int result = 0;
    for(int i : numbers){
      result += i;
    }
    System.out.println(result);
  }

}
