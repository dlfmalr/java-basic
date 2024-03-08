package day3;
// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.
public class LocalVariableExam2 {
    public static void main(String[] args) {
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        자동차 c1 = new 자동차();
        c1.최고속력 = 220;
        c1.run();
        // 출력 : 자동차가 최대속력 250km로 달립니다.
        자동차 c2 = new 자동차();
        c2.최고속력 = 250;
        c2.run();
    }
}
class 자동차 {
    int 최고속력;
    void run() {
        System.out.println("자동차가 최대속력 " + 최고속력 + "로 달립니다.");
    }
}