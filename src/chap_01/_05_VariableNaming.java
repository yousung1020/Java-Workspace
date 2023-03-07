package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        /*
        1. 저장할 값에 어울리는 이름
        2. 밑즐(_), 문자(abc), 숫자(123) 사용 가능
        3. 숫자로 시작 불가능
        4. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        5. 한 단어 또는 2개 이상 단어의 연속
        6. 예약어 사용 불가(public, static, void, int, etc..)
        */

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "유성"; // 이름
        String lastName = "최"; // 성
        String dateOfBirth = "2003-10-20"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국 목적
        String flightNo = "KE657"; // 항공 편명

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
//        CODE = "ff";

    }
}
