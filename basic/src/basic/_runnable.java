package basic;

public class _runnable {
    public static void main(String[] args) {
        _MyRunnable runnable = new _MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
