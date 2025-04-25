package basic;

public class MultiThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Thread1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Thread2: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}
