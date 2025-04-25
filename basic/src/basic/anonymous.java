package basic;

public class anonymous {
    public static void main(String[] args) {
        // 익명 클래스 정의
        Person person = new Person(){
            @Override
            public void introduce(){
                System.out.println("익명입니다.");
            }
        };
        person.introduce();
    }

}
