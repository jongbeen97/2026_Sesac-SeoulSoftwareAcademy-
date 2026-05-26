package ex03_return;

public class Calculator {
  int add(int a, int b){
    return a+b;
  }

  // 반환이 없는 메서드 리턴 
  void add(double a , double b ){
    if(a<0 || b<0) {
      return; // 메서드의 실행을 종료한다는 것.음수가 오면 더하기 하지 마라 !! 
    }else{
    System.out.println(a+b); // 반환 없이 직접 출력하고 끝
    }
  }
  
}
