import java.util.Scanner;

public class switchex {
  public static void main(String[] args) {
    // 월에 따른 계절 출력하기
    while(true){
    Scanner num = new Scanner(System.in);
    System.out.println("계절 입력 : ");
    int month = num.nextInt();

    // int month = 2;

    switch (month%12/3) {
      case 1:
        System.out.println("봄 입니다");
        break;
      case 2:
        System.out.println("여름 입니다");
        break;
      case 3:
        System.out.println("가을 입니다");
        break;
      case 0:
        System.out.println("겨울 입니다");
        break;
    
      default:
        break;
    }
  }
  }
}
