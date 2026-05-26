package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    /* 사용법 */

    System.out.println("===ArrayList 사용 방법===");
    /*  배열 리스트(ArrayList) 실습
     배열과 같은 원리로 사용이 됩니다 */

     // 1. 생성 (생성 시점에 타입을 결정한다)
     List<String> members = new ArrayList<>();

     //2. 요소 추가하기 
     members.add("지수");
     members.add("제니");
     members.add("리사");
     members.add("로제");

     //3. 저장된 요소 확인
     System.out.println("=== 저장 요소 확인 ===");
     System.out.println(members);
     System.out.println("======================");
     System.out.println();
     // get : 개별 요소 확인할 때 사용하는 메서드 
     System.out.println("=== 개별 요소 확인 ===");
     System.out.println(members.get(0));
     System.out.println(members.get(1));
     System.out.println(members.get(2));
     System.out.println(members.get(3));
     System.out.println("======================");
     System.out.println();


     // 4. 길이 확인 .size()메서드 : 저장된 요소의 길이 나옴. 
     // lengsth는 여기서는 사용이 안됨. 
     System.out.println("=== 요소 길이 확인 ===");
     System.out.println(members.size());
     System.out.println("======================");
     System.out.println();

     // 5. 요소 삭제 .remove

     //{1} remove index
     System.out.println("=== 요소 index 삭제 확인 ===");
     String removed = members.remove(0);
     System.out.println("삭제된 요소 확인 : " + removed);
     System.out.println("======================");
     System.out.println();

     //{2} remove object
     System.out.println("=== 요소 object 삭제 확인 ===");
     boolean isRemoved = members.remove("지수");
     System.out.println(isRemoved ? "삭제성공" : "삭제 실패");
     System.out.println(members);
     System.out.println("======================");
     System.out.println();

     // 6. 요소 존재 여부 확인 .contains
     String target = "윤아"; // 변수에 저장
     System.out.println("=== 요소 존재여부 확인 ===");
     if (members.contains(target)){ 
     System.out.println(target +"있다");
     }else{
      System.out.println(target+"없다");
     }
     System.out.println("======================");
     System.out.println();

     // 7. for 문 순회하기 ( 같은 값을 반환하는 반복적인 메서드 호출 지양)
     System.out.println(" === 7. for 문 순회하기 ( 같은 값을 반환하는 반복적인 메서드 호출 지양) ===");
     System.out.println();
     // 작성하면 안되는 코드 (members.size : 같은 값을 반환하는 반복적인 메서드)
     // 여기서 향상된 for문을 쓰거나 

     System.out.println("====작성하면 안되는 코드=====");
     for( int i = 0 ; i < members.size() ;i++){
      System.out.println(members.get(i));
     }
     System.out.println("======================");
     System.out.println();

     System.out.println("====좋은 코드====");
     for( int i = 0 ,length = members.size(); i < length ;i++){
      System.out.println(members.get(i));
     }
     System.out.println("===향상 for 문을 써도 됩니다===");
     System.out.println();

  }
}
