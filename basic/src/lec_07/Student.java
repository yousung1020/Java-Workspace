package lec_07;

public class Student {
    private String name;
    private String stuId;
    private String major;
    private String subject;

    public Student(String name, String stuId, String major, String subject){
        this.name = name;
        this.stuId = stuId;
        this.major = major;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuId='" + stuId + '\'' +
                ", major='" + major + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
