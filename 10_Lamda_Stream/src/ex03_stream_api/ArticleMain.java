package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleMain {
  public static void main(String[] args) {
    
    // 원본 리스트 생성하기 
    List<Article> articles = Arrays.asList(
      new Article("날씨",150),
      new Article("이란전쟁",77),
      new Article("미국증시",800),
      new Article("투표",600),
      new Article("식품",40)
    );
    // 스트림 API 활용하여 조회수 100이상인 기사의 제목을 List에 저장 
    List <String> titles = articles.stream()
    .filter(article -> article.getViewcnt()>=100)
    .map(article -> article.getTitle())
    .collect(Collectors.toList());

    System.out.println(titles);
  }

}
