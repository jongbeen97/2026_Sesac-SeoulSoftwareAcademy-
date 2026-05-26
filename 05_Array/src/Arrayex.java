import java.util.Arrays;
import java.util.Scanner;

public class Arrayex {
  public static void main(String[] args) {
    // 배열 :  여러 변수를 하나의 이름으로 관리를 하는 목적을 가지고 있습니다.
    // int a,b,c; -> int[] arr; 

    // 배열 선언 ( 변수 선언이랑 같다 보면 됨)
    String[] blackPink; // 4개의 문자열을 저장할 것 , 이런 배열을 쓰겟다고 선언 

    // 사용자 콘솔 입력 ( 배열의 길이를 사람이 정하도록 하는 것) 사용자가 데이터 입력을 하도록 도와주는 코드
    Scanner sc = new Scanner(System.in);
    System.out.println("4를 입력하세요 > ");
    int num = sc.nextInt();

    // 배열 생성 (실행 중에 메모리 할당하는 것 : 동적 할당 -> Heap 에서 별도로 관리를 한다)
    blackPink = new String[num];

    // 배열 요소(변수를 변수가 아니라 요소라고 함,Element : 각 변수를 의미)
    blackPink[0] ="지수";
    blackPink[1] ="제니";
    blackPink[2] ="로제";
    blackPink[3] ="리사";

    //배열의 길이
    System.out.println(blackPink.length);

    //출력 
    for (int i = 0 ; i<blackPink.length;i++){
      System.out.println(blackPink[i]);
    }

    // 정적 초기화 (배열 선언 시에만 가능한 초기화[를 하는 것을 말한다])
    String[] seasons = {"봄","여름","가을","겨울"};
    for ( String season : seasons){
      System.out.println(season);
    }
    // 동적 초기화(배열 선언과 분리가 가능한 초기화)
    String[] hobbies;//선언을 먼저
    hobbies = new String[] {"헬스","코딩"};
    for(String hobby : hobbies){
      System.out.println(hobby);
    }

    // 배열의 길이는 수정이 불가하다. 
    // 배열의 길이를 늘리는 방법 : 새 배열을 만들어 이사가기
    String[] names = {"김철수","홍길동"}; // 이는 두개 이름만 가능하다. 추가안됨
    String[] newArray = new String[5]; // 5개 짜리 새 집을 만든다.
    //이사보내기
    System.arraycopy(names, 0, newArray, 0, names.length);// 이거는 for 문 없어도 이사를 가도록 해준다. 
    names = newArray; // newArray를 names로 보낸다
    System.out.println(Arrays.toString(names)); //배열을 문자열 형식으로 출력해달라는 것
  }
}
