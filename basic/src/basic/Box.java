package basic;

public class Box<T> {
    T data;
    public void setData(T data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "data = " + data;
    }
}
