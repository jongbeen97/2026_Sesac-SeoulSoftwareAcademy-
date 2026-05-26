package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
  public static void main(String[] args) {
    // 확인 사항 
    // 1. 중복해서 저장해보기 ( 중복 저장이 안되어야 정상 )
    // 2. 존재여부 확인해보기 ( 정상해야 정상 )
    // 3. 저장된 객체 정보 출력해보기(toString존재 확인)

    // Set 생성하기
    Set<Member> member = new HashSet<>();
    // 요소 추가하기<중복해서 저장해보기>
    member.add(new Member("지수", 23));
    member.add(new Member("로제", 22));
    member.add(new Member("리사", 21));
    member.add(new Member("제니", 20));
    member.add(new Member("지수", 23));
    member.add(new Member("로제", 22));
    member.add(new Member("리사", 21));
    member.add(new Member("제니", 20));

    // 요소 존재여부 확인하기 
    Member target = new Member("로제", 22);
    if (member.contains(target)){
      System.out.println(target.getName()+"is exist");
    }else{
      System.out.println(target.getName()+"is NoExist");
    }
    // 저장된 객체 정보 출력
    for(Member m : member){
      System.out.println(m);
      // System.out.println(m.getName());
      // System.out.println(m.getClass());
    }
  }

}
