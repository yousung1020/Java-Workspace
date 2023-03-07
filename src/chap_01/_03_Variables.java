package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "유성";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l; // -21억 ~ 21억 까지는 int 형, 그 이상 초과하면 long 형
        l = 1_000_000_000_000l;
        System.out.println((l));
        
        // 1:11:31 (주석) 부터 시청
    }
}
