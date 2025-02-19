public class ConstractMethodReference {

    public static void main(String[] args) {
        /*
        * 自定义类的构造方法,就是lambda表达式的方法体就是新建一个对象
        * 语法：
        *   类名:: new
        * */
        //正常Lambda表达式
        sayHello("Karley",s->new Student(s));

        //方法引用
        //这里有很构造方法，具体使用哪个要看函数式接口的方法与那个构造函数的参数列表一致
        sayHello("Amy",Student::new);

        /*
        *
        * 数组的“构造方法”
        * 语法：
        *   数据类型[]::new
        * */
        //Lambda
        int[] a = createArray(3, n -> {
            return new int[n];
        });
        System.out.println(a.length);
        //方法引用
        int[] b= createArray(6,int[]::new);
        System.out.println(b.length);

    }
    public static void sayHello(String name, StudentInfo studentInfo){
        Student s = studentInfo.NewStudent(name);
        System.out.println(s.toString());
    }

    public static int[] createArray(int n,ArrayBuilder arrayBuilder){
        return arrayBuilder.build(n);
    }
}
