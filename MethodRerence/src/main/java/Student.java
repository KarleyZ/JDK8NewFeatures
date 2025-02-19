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

    @Override
    public String toString() {
        return "同学："  + name + "，你好！";
    }
}
