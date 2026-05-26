public class Varable {
  public static void main(String[] args) {
    // 6가지 기본 타입 (boolean, byte , int , long , double , char(character) )
    // 변수 선언 : 나 앞으로 이 변수를 쓰겟다고 알려주는 것
    // 타입 + 이름을 적어준다. 변수 이름 적을 때 규칙 : 첫글자는 무조건 소문자(camelCase)
    boolean hasPen = true; // is or has 이다
    byte a = 127; // 128이면 자동으로 컴파일러가 오류가 있다고 말해준다. 강제 케스팅을 이용해서 128로 형변환을 할수 있다.
    int b = 30;
    long c = 9999999999999L; // L을 적어주어야 long이 먹는다
    double d = 0.3141592; // 소수점
    double e = 1; // 자동 형 변환이 이루어져서 int로 자동으로 바꾼다. (데이터 훼손이 없기 때문에 )
    char f = '가';
    // 앞으로 이런 변수를 쓰겟다는 것이다.
    // 노란색 밑줄 : 변수를 만들었는데 왜 안써 ? 라는 경고문이다 !
    System.out.println(hasPen);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    // 문자열 (String)
    String str = "Hello World";
    System.out.println(str);

    // 자료 형변환
    int n1 = 10;
    long n2 = n1; // 자동 형변환, n1이 n2로 자동으로 형변환을 해주는 것
    System.out.println(n1);
    System.out.println(n2);

    // 강제 형변환
    int i = 256; // ------- 비트값 : 1 0 0 0 0 0 0 0 0
    byte bo = (byte) i; // -- 비트값 : X 0 0 0 0 0 0 0 0 (상위 비트 손실로 값이 달라짐)
    System.out.println(i);
    System.out.println(bo);

    // double -> long 변환
    double dod = 1.9;
    long l = (long) dod; // -- 실수 -> 정수 변환 시 소수부 아래는 모두 손실
    System.out.println(dod);
    System.out.println(l);

    // // int -> char 변환
    int iNum = 48; // --------- 48('0'), 65('A'), 97('a')
    char ch = (char) iNum; // -- 정수 -> 문자 변환 시 정수를 코드값으로 가지는 문자로 변환
    System.out.println(iNum);
    System.out.println(ch);
  }
}
