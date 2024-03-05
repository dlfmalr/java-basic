package day2;

public class ArrayExam3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("역방향으로 출력");

        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}
