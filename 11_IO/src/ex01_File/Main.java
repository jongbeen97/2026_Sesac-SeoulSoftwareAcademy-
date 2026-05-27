package ex01_File;

import java.io.File;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    // 자바 홈을 File 객체로 생성하기
    // Path : (C:\Program Files\Java\jdk-21.0.10)
    File javaHome = new File("C:/Program Files/Java/jdk-21.0.10");

    // 기본 정보 확인
    System.out.println("이름:" + javaHome.getName());
    System.out.println("절대경로:" + javaHome.getAbsolutePath());
    System.out.println("상대경로:" + javaHome.getPath());
    System.out.println(javaHome.isDirectory() ? "디렉터리" : "파일");
    System.out.println("크기:" + javaHome.length() + "byte");
    System.out.println("최종수정일:" + javaHome.lastModified());
    // Epoch타입 : 유닉스 운영체제에서 시작한 시간
    // C언어 개발되고 유닉스 운영체제가 만들어짐. C언어 기반으로 설정을 한 값중 하나.
    // 날짜를 1970년 1월 1일 0시 0분을 시작으로 보고 숫자를 매겨준 것이 epoke타입이다.
    // 자바에서는 밀리초 (1/1000 초) 로 나눈다. 실행할 때 마다 늘어나는거 확인하고 실행 하면 조금씩 값이 늘어날 것이다 ( 1초마다
    // 1000씩 늘어남 )
    // 이를 timestamp라고도 한다. 몇년 몇월 몇일 몇시 몇분 까지 나오게 할수 있다. 계산을 하면 됨.

    // 하위 디렉터리들 파일 객체를 가져오기 (파일의 이름, 크기 출력)
    File[] files = javaHome.listFiles();
    //Arrays.stream(files).forEach(file -> {
    //  System.out.println(file.getName());
    //  System.out.println(file.length());
    //});

    Arrays.stream(files)
    .filter(file -> file.isFile())
    .forEach(file->{
           System.out.println(file.getName());
      System.out.println(file.length());
    });

    // 디렉터리 조작 ( 생성 and 삭제 )
    File dir = new File ("C:\\2026_Sesac-SeoulSoftwareAcademy\\JavaStudy\\io_test");
    if (dir.exists()){
      System.out.println(dir.getAbsolutePath() + " 존재합니다 ");
    } else {
      dir.mkdirs(); // 없다면 생성을 하라는 것 ( 리눅스 언어랑 동일 )
      // 폴더 만들기 ( s가 들어있으면 하위 폴더 까지 중첩해서 만들라는 것이다)
      System.out.println(dir.getAbsolutePath()+"생성했습니다.");
    }

    // 폴더 삭제 
    dir.delete(); // 단 , 비어있는 폴더만 삭제가 가능합니다. 파일이 있다면 내부 파일 삭제후 .. 

  }

}
