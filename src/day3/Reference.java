package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); //객체가 힙 메모리에 생성
        Person p2 = new Person();
        //스택에 p1, p2 생성

        System.out.println(p1);
        System.out.println(p2);

        //사람 복사
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        //사람 복사
        //참조값 복사
        Person p3 = p1; //홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        //홍길동은 2명이 되지 않음
        //홈이 아닌 스택에서 변수가 만들어졌기 때문에

        p3.name = "이순신";

        System.out.println(p3.name);
        System.out.println(p1.name);

        //손흥민 2명 만들기(단, 중복코드는 없어야 함)
        //객체값 복사

        Person p4 = new Person();
        p4.name = "손흥민";
        p4.age = 32;
        p4.home = "런던";

        Person p5 = new Person();
        p5.name = p4.name;
        p5.age = p4.age;
        p5.home = p4.home;

        p4.name = "손흥만";
        System.out.println(p4.name);
        System.out.println(p5.name);
        System.out.println(p4.age);
        System.out.println(p4.home);

        //객체의 복사
        //참조값의 복사 -> 얕은 복사
        //객체값의 복사 -> 깊은 복사

    }
}

