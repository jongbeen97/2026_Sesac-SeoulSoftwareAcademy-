package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    
    // 1. HashSet(Hash 기반 set)
    /*
    특징 
    - 인덱스 없음 ( 저장의 순서 없음 )
    - 데이터 중복이 안됨 (데이터 중복 저장 불가 , 동일한데이터 저장불가)
     */
    Set<String> members = new HashSet<>();

    // 2. 요소 추가하기 
    // arraylist는 지정구조가 가능하지만, 큰 틀에서 변화 없음 , index관련해서 없기에 !! 
    members.add("지수");
    members.add("로제");
    members.add("제니");
    members.add("리사");

    // 3. 요소 하나씩 가져오기(불가능하다.)전체 집합으로 관리를 하는 것이 목적이기 때문 

    //4. 요소 삭제 (인덱스 기반의 삭제는 없음, 값,객체를 을 기반으로 )
    members.remove("지수");

    //5. 요소 존재여부 (가능하다)
    if(members.contains("로제")){
      System.out.println("존재한다");
    }else{
      System.out.println("존재하지 않는다.");
    }

    //6. for 문 순회 하기 
    //for (요소 : 배열(반복이 가능한 것만 들어갈 수 있음) ){}
    for(String member : members){
      System.out.println(member);
    }
    // 결과에서 신경 써야하는 것은 출력순서이다. 저장순서랑 다르다. 
      
    }

  }


