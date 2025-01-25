package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        // 조건1: 키가 120cm 이상인 경우에만 탑승 가능
        // 조건2: 삼항 연산자 이용
        // 실행결과: 키가 115cm 이므로, 탑승하실 수 없습니다, 키가 135cm 이므로, 탑승하실 수 있습니다.

//        int tallOfKid = 120;
//        String s = (tallOfKid >= 120) ? "키가 " + tallOfKid + "이므로 탑승하실 수 있습니다." : "키가 " + tallOfKid + "이므로 탑승하실 수 없습니다.";
//        System.out.println(s);

        int tallOfKid = 120;
        String a = (tallOfKid >= 120) ? "키가 " + tallOfKid + "이므로 탑승하실 수 있습니다." : "키가" + tallOfKid + "이므로 탑승하실 수 없습니다.";
        System.out.println(a);
    }
}
