package ex02_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Repectoring Code
 */
public class Main {
  public static void main(String[] args) {

    // file 객체 (우리가 만드려는 대상)
    File dir = new File("/storage");
    // 존재하지 않는다면
    if (!dir.exists()) {
      dir.mkdirs(); // 없으면 만들어라 make directories
    }

    // storage / text.txt 를 만든다.
    File file = new File(dir, "test.txt");

    // 파일로 데이터를 보내는 스트림(출력 스트림 - 통로라고 생각하면 좋을 거 같음) 데이터를 내보내는 통로

    // 코드 리펙토링 - 위와 같은 경우 close (만든 순서 역순으로 만들어야 하는데, 코드의 간결화를 만듦.)
    // buffer 내장된 코드 
    try (BufferedOutputStream fos = new BufferedOutputStream( new FileOutputStream(file,true))) {

      // 실제로 데이터 내보내기
      int c = 'A';
      byte[] b = "pple,logs".getBytes();
      fos.write(c);
      fos.write(b);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

}
