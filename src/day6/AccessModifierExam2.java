package day6;

public class AccessModifierExam2 {
    // 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
    public static void main(String[] args) {
        Person p1 = new Person();

        //p1.id = 20;
        p1.setId(20);
        System.out.println("제 번호는 " + p1.getId() + " 입니다.");

        //p1.printAge();

        // 나이가 음수인 것은 이상하다. 하지만 -20이 들어오는 것을 막을 수 없다.
        p1.setAge(-20);
        //p1.printAge();

        // 출력 : 제 번호는 20 입니다.


    }


}
class Person {
    private int id;

    private int age;

    private String name;

    private String address;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.

    //카멜표기법 : 단어 여러개 조합해서 명명할 때 의미가 바뀌는 부분에서 대문자를 넣어주는 방식

    //alt + ins -> getter and setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}