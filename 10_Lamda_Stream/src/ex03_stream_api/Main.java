package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    //원본 리스트 
    List<String> members = Arrays.asList("kim","jessica", "john", "tomson" , "jjit");

    //원본 리스트를 이용해 Stream 생성하기

    // (1) stream 생성 및 메서드 호출 
    Stream<String> stream = members.stream();

    // 최종 연산 
    //stream.forEach(member -> System.out.println(member) ); // 이게 for 문 돌린 것. 
    // 중간 연산 + 최종 연산 -> 이미 다 써서 닫혀 있거나 그래서 오류 나는 것. stream has already been operated upon or closed
    // stream.filter(member -> member.length()<=4 )
    //   .map(member->member+"님")
    //   .forEach(member -> System.out.println(member));

      List<String> list = stream.filter(member -> member.length()<=4 )
      .map(member->member+"님")
      .collect(Collectors.toList());

      System.out.println(list);
  }

}
