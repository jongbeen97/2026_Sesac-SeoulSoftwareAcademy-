public class ArrayExample {
  public static void main(String[] args) {
    int[] numbers = { 4, 7, 9, 12, 17, 19, 24, 28, 30 };

    int sum = 0;
    double avg = 0;
    for (int number : numbers) {
      sum += number;
    }
    avg = (double) sum / numbers.length;
    System.out.println("합계" + sum);
    System.out.println("평균" + avg);

    System.out.println("=====================");
    // 최댓값 최솟값 구하기
    int[] numbers2 = { 42, 17, 93, 120, 117, 59, 24, 28, 39 };
    // 첫번째 요소 초기값으로 지정
    int max = numbers2[0];
    int min = numbers2[0];
    // 두번째 요소부터 비교
    for (int i = 1; i < numbers2.length; i++) {
      if (max < numbers2[i]) {
        max = numbers2[i];
      }
      if (min > numbers2[i]) {
        min = numbers2[i];
      }
      System.out.println("max" + max);
      System.out.println("min" + min);
    }
  }
}
