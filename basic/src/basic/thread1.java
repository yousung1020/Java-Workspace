package basic;

public class thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5;i++){
            System.out.println("Thread: " + i);
        }
    }
}
