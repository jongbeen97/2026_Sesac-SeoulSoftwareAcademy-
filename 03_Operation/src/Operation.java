public class Operation{
  public static void main(String[] args) {
  int a = 5;
	int b = 2;
	int zero = 0;
  System.out.println("=========정수=========");
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	System.out.println(a / b);     // 나눈 몫
	// System.out.println(a / zero);  // 0으로 나누면? ArithmeticException 발생!
	System.out.println(a % b);   
    System.out.println("==========================");

    	// 실수
	double x = 5.0;
	double y = 2.0;
	double z = 0.0;
  System.out.println("============실수=============");
	System.out.println(x + y);
	System.out.println(x - y);
	System.out.println(x * y);
	System.out.println(x / y);     // 나눈 값
	System.out.println(x / z);  // 0으로 나누면? Infinity (무한대)
	System.out.println(x % y);     // 나눈 나머지
	System.out.println(x % z);  // 0으로 나눈 나머지는? NaN (숫자가 아님)
  System.out.println("=========================");

  }
}