package ex03_set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
