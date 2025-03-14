package _2_1_java_class;

public class student {
    private String name;
    private double score;

    public student(String name, double score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public double getScore(){
        return score;
    }
}
