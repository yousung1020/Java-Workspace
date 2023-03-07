package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score);

        float score_f = 93.0f;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score); // 93 + 98

        score_d = 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        // int -> long -> float -> double (자동 형변환)

        // 숫자를 문자열로

        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(93.8);
        s2 = Double.toString(93.8); // Double 이라는 클래스가 제공하는 메소드
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("93.8");
        System.out.println(d);


    }
}
