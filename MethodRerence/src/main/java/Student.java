import java.util.Map;

public class Student {
    String name;
    Integer Age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "同学："  + name + "，你好！";
    }

    public String getStudentScore(String sname,Integer score){
        return "同学："+ sname + "，您的分数是" + score;
    }
}
