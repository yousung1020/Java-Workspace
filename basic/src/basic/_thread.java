package basic;

public class _thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // 새로운 쓰레드에서 run 메소드 호출 및 수행
    }
}
