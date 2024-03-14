package Exam.Duck2;

import Exam.Duck1.*;

//추상메서드(abstract)를 활용한 객체 만들기
public class Duck2 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        a고무2오리.헤엄치다();

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
    }
}

abstract class 날개아이템 {
    abstract void 사용();
}

class 날개 extends 날개아이템{
    void 사용() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class 고무날개 extends 날개아이템 {
    void 사용() {
        System.out.println("저는 날 수 없어요.");
    }
}
class 불사조날개 extends 날개아이템 {
    void 사용() {
        System.out.println("불사조가 날개로 날아갑니다.");
    }
}
abstract class 발아이템 {
    abstract void 사용();
}
class 발 extends 발아이템 {
    void 사용() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 고무발 extends 발아이템 {
    void 사용() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

class 오리 {
    날개아이템 a날개 = new 날개();
    발아이템 a발 = new 발();
    void 날다() { //첫 클래스에서 날다와 헤엄치다를 정의해야한다.
        a날개.사용();
    }
    void 헤엄치다() {
        a발.사용();
    }
}
class 청둥오리 extends 오리 {}
class 흰오리 extends 오리 {}
class 고무오리 extends 오리 {
    고무오리() {
        a날개 = new 고무날개();
        a발 = new 고무발();
    }
}
class 고무2오리 extends 고무오리 {}
class 아수라오리 extends 오리 {
    아수라오리() {
        a날개 = new 불사조날개();
        a발 = new 고무발();
    }
}