package day3;

public class ParmeterExam4 {
    public static void greeting1(int l) {
      if(l == 1) {
          System.out.println("안녕하세요");
      }
      else if(l == 2) {
          System.out.println("하이~");
      }
      else {
          System.out.println("봉쥬");
      }
    }

    public static void greeting2(int l, int c) {
        for(int i = 1; i <= c; i++) {
            if(l == 1) {
                System.out.println("안녕하세요");
            }
            else if (l == 2) {
                System.out.println("하이~");
            }
            else {
                System.out.println("봉쥬");
            }
        }
    }
    public static void main(String[] args) {
        greeting1(2);

        greeting1(3);

        greeting1(1);

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }
}
