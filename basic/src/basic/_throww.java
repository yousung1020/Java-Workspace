package basic;

public class _throww {
    public static int divide(int a, int b) throws Exception{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            divide(3, 0);
        } catch(Exception e){
            System.out.println("0으로 나눌 수 없");
        }
    }
}
