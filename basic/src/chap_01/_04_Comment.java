package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        // System.out.println("(5분전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        int size = 120;
        size = size + 10; // 10만큼 더 큰 신발을 구매
        size += 10;
        size -= 10;
        size *= 10;
        size /= 10;
        size %= 10;
        System.out.println("신발 사이즈 " + size + "으로 보여주세요.");


/*
        int a = 10;
        int b = 20;
        System.out.println(a + b);
*/

        // ctrl + / :  한줄 주석
        // ctrl + shift + / : 여러줄 주석
    }
}
