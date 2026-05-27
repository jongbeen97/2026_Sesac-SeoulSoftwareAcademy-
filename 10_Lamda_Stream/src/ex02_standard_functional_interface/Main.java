package ex02_standard_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//매개변수가 함수형 인터페이스인 경우 : 람다식을 전달한다. 


public class Main {
  public static void main(String[] args) {
    // 양수 호출 
    executePredicate(10, num -> num>0);
    // 음수 호출
    executePredicate(-10, num -> num > 0);

    executeFunction("홍길동", name -> name.length());

    executeSupplier(() -> {return "hello supplier";});

    // executecunsumer 호출하는 방법 
    // 메서드 호출 , 2개 파라미터
    executeConsumer("홍길동", (name)->System.out.println("이름:" + name));

    // 파라미터 인자가 한개면 생략이 가능하다
    executeConsumer("홍길동", name->System.out.println("이름:" + name));
  }
  // Predicate는 주는 것만 제네릭 처리하고 , 반환은 정해져 있어 적지 않는다. 반환은 무조건 `boolean` 
  // filterling 할 때 주로 사용
  /**
   * 
   * @param param 람다식에 전달할 값
   * @param predicate 값(param)을 받아서 체크한 뒤 boolean을 반환하는 함수
   */
  public static void executePredicate(Integer param,Predicate<Integer>predicate){
    // 양수인지 음수인지 결정하는 predicate 만들기 
    if (predicate.test(param)){
      System.out.println(param +"은 양수!");
    }else{
      System.out.println(param+ "은 음수!");
    }
  }


  //function :  값을 주고 반환이 되는 값이 다 있음(<매개변수타입,반환값 타입>)
  // 문자 주고 숫자 받기 , 전달이 문자열 반환이 숫자열
  // 값을 주고 반환을 받기에 string param 이라고 전달 값을 주는 것이 필요함
  /**
   * 
   * @param param 람다에 전달할 값
   * @param function 값을 받아서 가공하여 반환하는 함수(람다식)
   */
  public static void executeFunction(String param,Function<String,Integer> function){
    Integer result = function.apply(param); // int로 해도 본문상 문제 없음. 케스팅 자동으로 됨. 
    System.out.println("function 결과 :"+result);// 함수를 만드는 것은 Main에서 만드는 것이다. 
  }

  //공급자 supplier : 값을 반환하는 아이
  /**
   * 
   * @param supplier 값을 반환하는 함수(람다식)
   */
  public static void executeSupplier(Supplier<String> supplier){
    String result = supplier.get();
    System.out.println("Supplier결과 : "+result);
  }

  // consumer : 받아서 쓰는 것. 
  // param : 받아온 값, consumer 함수, 그 값을 사용할 함수

  /**
   * 
   * @param param 람다식에 전달할 값
   * @param consumer 값(param) 을 받아서 사용하는 함수(람다식)
   */
  public static void executeConsumer(String param , Consumer<String> consumer){
    consumer.accept(param);
  }
}
