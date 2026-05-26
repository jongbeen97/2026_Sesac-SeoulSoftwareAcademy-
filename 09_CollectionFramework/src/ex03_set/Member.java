package ex03_set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*
롬복을 활용을 할 경우 . 코드의 다이어트가 가능하다.
 */
// 생성자 constructor
@AllArgsConstructor
// getter 
@Getter
//setter 
@Setter
// tostring
@ToString
//hashcode() and equals()
@EqualsAndHashCode
public class Member {
  private String name ;
  private int age ;


}
