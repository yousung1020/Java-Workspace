package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결괏값) : (거짓의 경우 결괏값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max); // max 의 조건식이 참이므로 x 의 결괏값 출력

        int min = (x > y) ? y : x;
        System.out.println(min);

        int a = 3;
        int b = 3;

        boolean c = (a == b) ? true : false;
        System.out.println(c);

        String s = (a == b) ? "같아요" : "달라요";
        System.out.println(s);
    }
}
