package day4;

public class CastingExam3 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}
class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }

    void 공격() {
        System.out.println(이름 + "이/가 ");
        a무기.사용();
    }
    public void 스킬사용() {
        System.out.print(이름 + "이/가 ");
        a무기.무기스킬사용();
    }
}
