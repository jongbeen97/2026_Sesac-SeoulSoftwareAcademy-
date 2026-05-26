package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
  public static void main(String[] args) {
    //1. ArrayList 생성하기
    List<Member> members = new ArrayList<>();

    //2. 요소 추가하기 
    members.add(new Member("지수", 20));
    members.add(new Member("리사", 22));
    members.add(new Member("로제", 23));
    members.add(new Member("제니", 26));

    //3. 요소 확인하기 
    // 개별 요소 확인하기 
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));

    //4. 요소 객체를 지우기 위해서 <동작 안할 것>
    boolean isRemoved = members.remove(new Member("지수",20));
    System.out.println(isRemoved ? "삭제 완료" : " 삭제 실패");

    //5. 요소 존재여부 확인하기 <동작 안할 것>
    Member target = new Member("로제", 23);
    if (members.contains(target)){
      System.out.println(target+"있다");
    }else{
      System.out.println(target+"없다");
    }

    // 6. for 문 순회하기 
    for(int i = 0 ,length =  members.size();i<length;i++){
      System.out.println("이름" +members.get(i).getName()+ ", 나이" +members.get(i).getAge());
      // 같은 일을 할 메서드를 두번 부를 이유 없다. getmembers를 두번이 아니라 한번만 바꾸면 됨
      Member foundMember = members.get(i);
      System.out.println("이름" +foundMember.getName()+ ", 나이" +foundMember.getAge());
    }

    for (Member member : members) {
      System.out.println("이름" + member.getName());
    }
  }

}
