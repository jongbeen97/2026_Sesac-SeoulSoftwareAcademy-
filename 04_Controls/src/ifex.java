import java.util.Scanner;

public class ifex {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("나이 입력 : ");
    int age = num.nextInt();
    if (age>=20){
      System.out.println("성인데스");
    }else if(age>=17){
      System.out.println("고삐리 데스");
    }else if(age>=14){
      System.out.println("중딩 데스");
    }else if(age>=8){
      System.out.println("잼민이 데스");
    }else if(age>=0){
      System.out.println("아가");
    }else{
      System.out.println("아메바");
    }
    }
  }

