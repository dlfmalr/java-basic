package day5.tv1;

public class TVsimulation {
    //추상클래스와 추상메서드
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.


        LGTv aLGTv2 = (LGTv)a표준Tv; //(LGTv)는 형변환에서 생기는 오류를 막기위해 쓰는 것
        aLGTv2.게임모드전환();
    }
}

// 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속받아 오버라이딩을 해서 사용해야 한다.
// (단독 사용 불가능) 표준TV a표준 = new 표준(); -> X
class 샤오미Tv extends 표준Tv{ // 표준TV에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행 할 수 없음
    public void 켜기() {
        System.out.println("샤오미TV 켜집니다.");
    }
    public void 끄기() {
        System.out.println("샤오미TV 꺼집니다.");
    }
    public void vr켜기() {
        System.out.println("샤오미TV vr켜기!");
    }

}
class 삼성Tv extends 표준Tv{
    public void 켜기() {
        System.out.println("삼성TV 켜집니다.");
    }
    public void 끄기() {
        System.out.println("삼성TV 꺼집니다.");
    }
    public void ar켜기() {
        System.out.println("삼성TV ar켜기!");
    }
}
class LGTv extends 표준Tv{
    public void 켜기() {
        System.out.println("LGTV 켜집니다.");
    }
    public void 끄기() {
        System.out.println("LGTV 꺼집니다.");
    }
    public void 게임모드전환() {
        System.out.println("LGTV 게임모드전환!");
    }
}
abstract class 표준Tv { //추상클래스
    abstract void 켜기(); // 추상메서드
    abstract void 끄기();
}