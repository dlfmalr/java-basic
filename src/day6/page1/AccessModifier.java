package day6.page1;
import day6.page2.Test; //다른 폴더(패키지)의 클래스를 불러온다.
public class AccessModifier {

    public static void main(String[] args) {

        //접근제어자 => 인스턴스변수와 메서드, 클래스에 사용
        //public, protected, default, private
        // 모든 클래스에서 접근 가능
        // 같은 패키지 내의 클래스와 다른 패키지의 상속관계에 있는 클래스에서 접근 가능
        // 같은 패키지 내의 클래스에서 접근 가능
        // 같은 클래스 내에서만 접근 가능

        //alt + enter 로 자동 임포트 가능

        int num = 10;
        Test t1 = new Test();
        System.out.println(t1.a);

        Test2 t2 = new Test2();
        //t2.a = 20; //같은 패키지 안에서도 사용불가
        //LGTv tv = new LGTv();

    }
}
class Test2 {
    private int a; //자기 자신만 사용가능. Test2 클래스 내에서만 사용 가능
}