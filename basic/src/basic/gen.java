package basic;

public class gen {
    public static void main(String[] args){
        Box<Integer> iBox = new Box<>();
        iBox.setData(133);
        Box<String> sBox = new Box<>();
        sBox.setData("skrr");
        System.out.println(iBox);
        System.out.println(sBox);
    }
}
