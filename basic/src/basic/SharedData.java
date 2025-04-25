package basic;

// synchronized: 여러 스레드가 동일한 자원(객체, 변수)에 접근할 경우, 값이 예상치 못하게 변하는 경우가 있음
// synchronized: 그러므로 하나의 스레드만 코드에 접근할 수 있도록 제한한다.
public class SharedData {
    public int data = 0;
    synchronized public void increment(){
        data++;
    }
}
