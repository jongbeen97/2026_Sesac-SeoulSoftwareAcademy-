package ex04_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {

  // 파일 복사
  public static void copy(String source, String copy) {

    // 읽을 파일의 File 객체 생성
    File src = new File(source);

    // 복사할 파일 File 객체
    File dest = new File(copy);

    // src 읽기 -> byte[] 저장 -> byte[] => dest 로 보내기.[읽어서보내기]
    // 서버에 메모리를 사용하는 방법 (서버 메모리 저장 -> 목적지 파일 보내기)
    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src))) {
      byte[] b = new byte[4];
      int readByte = 0;

      while ((readByte = bis.read(b)) != -1) {
        bos.write(b, 0, readByte); // b배열의 0번째 부터 읽어들인 만큼만 내보내겟다.
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(dest.getAbsolutePath() + "file 복사 완료.");

  }
}
