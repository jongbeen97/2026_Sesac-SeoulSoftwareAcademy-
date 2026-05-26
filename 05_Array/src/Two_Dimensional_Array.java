// 2차원 배열 
public class Two_Dimensional_Array {
  public static void main(String[] args) {
    int[][] scores = {
        { 10, 20 }, // 0층
        { 30, 40 }, // 1층
        { 50, 60 } // 2층
    };

    // 바깥쪽 for문: scores 아파트에서 한 '층(1차원 배열)'씩 통째로 꺼냅니다.
    for (int[] row : scores) {

      // 안쪽 for문: 꺼내온 그 층(row)에서 '알맹이 숫자(int)'를 하나씩 꺼냅니다.
      for (int score : row) {
        System.out.print(score + " ");
      }
      System.out.println(); // 한 층 출력이 끝나면 줄바꿈
    }
  }
}
