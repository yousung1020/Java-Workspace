package basic;

public class Join {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Thread: " + i);
            }
        });
        thread.start();
        thread.join(); // thread의 실행을 마칠 때까지 대기
        method();
    }

    public static void method() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Method: " + i);
        }
    }
}
