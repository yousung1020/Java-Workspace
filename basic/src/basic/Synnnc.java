package basic;

public class Synnnc {
    public static void main(String[] args) throws InterruptedException {
        SharedData sharedData = new SharedData();

        Thread thread1 = new Thread(() -> {
            for(int i = 1; i<= 1000; i++){
                sharedData.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 1; i<= 1000; i++){
                sharedData.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("SharedData: " + sharedData.data);
    }
}
