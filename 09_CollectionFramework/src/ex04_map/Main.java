package ex04_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {

    // Map은 초기화 하는 방법도 알아두는 것이 좋다.
    // 1. HashMap 객체 생성
    Map<String, Object> map = new HashMap<>();

    // 2. Entry 저장 (key+value => entry) 방법
    map.put("name", "홍길동");
    map.put("age", 30); // value는 object이니 string, int다 가능
    map.put("hobbies", new String[] { "러닝", "헬스", "운동", "코딩", "독서" }); // 어떤 데이터 타입이건 저장이 가능하다.키만 문자열로 저장하면 된다.

    // 3. Entry 수정 (기존 사용하던 key를 다시 사용하면 ? 기존 value가 수정됨. )
    map.put("name", "김철수"); // put 메서드 하나로 다 하는 것.

    // 4. 정보 확인 (value 확인 => key를 이용해 Value 확인)
    System.out.println("이름: " + map.get("name"));
    System.out.println("나이: " + map.get("age"));

    // 여기서 tostring은 왜 안될까? 해결책은 다운케스팅
    System.out.println("취미: " + Arrays.toString((String[]) map.get("hobbies")));

    System.out.println("생일: " + map.getOrDefault("birthday", "생일정보없음"));
    // getOrDefault : 데이터가 없다면 기본 값을 쓰라는 것.
    // 실무에서는 유용한 메서드 , 존재하지 않는 값을 처리하는 메서드

    // 5. entry순회 1(Key를 이용한 순회 방식)
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println("Key:" + key + ", Value: " + map.get(key));
      // 키만 따로 빼서 순회하는 방식으로 , 엔트리 순회 가능하다. (맵의 키를 가져오면 벨류값을 가져올 수 있음 )
    }
    System.out.println("==================");

    //6.엔트리 순회 2 (엔트리 인터페이스 이용한 순회방식 - 추천 방식)
    // 엔트리 단위로 빼기 
    for (Entry<String,Object>entry : map.entrySet()){
      System.out.println("key"+entry.getKey() + ".value" +entry.getValue());
    }
    // 처음 엔트리에 비해 가독성이 더 좋아진다. 
  }

}
