package day4;

public class CastingExam2 {
    public static void main(String[] args) {

        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.
    }
}

class 무기 {

    public void 공격() {}

    public void 사용() {}
    public void 무기스킬사용() {}
}

class 칼 extends 무기{
    double damage = 10;
    double magnification = 2;
    double skillDamage = damage * magnification;


    public void 사용() {
        System.out.println("칼로 데미지 " + damage + " 공격");
    }
    public void 무기스킬사용() {
        System.out.println("연속 베기 스킬을 사용합니다. " + magnification + "배(" + skillDamage + ")의 피해를 입힙니다.");
    }
}

class 활 extends 무기{
    double damage = 15;
    double manification= 1.5;
    double skillDamage = damage * manification;
    public void 사용() {
        System.out.println("활로 데미지 " + damage + " 공격");
    }

    public void 무기스킬사용() {
        System.out.println("불화살 스킬을 사용합니다. " + manification + "배(" + manification + ")의 피해를 입힙니다.");
    }

}
