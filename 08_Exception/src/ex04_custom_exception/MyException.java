package ex04_custom_exception;
/*
실행 예외 만들기 ( 일반적인 상황 )
RunTimeException 상속받기 
생성 시점에 모든 필드가 채워지도록 구성을 해야 함. (생성자 필수)
*/
public class MyException extends RuntimeException{

  // 필드 생성 
  private int errorCode;

  // 생성자 생성
  public MyException(String message, int errorCode){
    // 부모 클래스에서 메시지 가져오기 
    super(message);

    //에러코드 가져오기 
    this.errorCode = errorCode;
  }

  // 메서드 (Getter) 가져오기
    public int getErrorCode() {
    return errorCode;
  }
  //Setter는 굳이 수정을 할 필요가 없으니 , 가져올 필요 없다 ( 에러는 그냥 가져와지는 것이니 )

}
