package basic;

// Runnable은 Thread와는 다르게 인터페이스로 정의되어 있어, 구현체를 만들어야 함 (인터페이스로 정의되어 있으므로, 다중상속 가능)
public class _MyRunnable implements Runnable{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Runnable: " + i);
        }
    }
}
