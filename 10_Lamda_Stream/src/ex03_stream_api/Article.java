package ex03_stream_api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
미션 
Lombok 이용하여 Constructor ,getter,setter,tostring 채우기  */


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Article {
  // 필드 
  private String title;// 제목 
  private int viewcnt;//조회수

  

}
