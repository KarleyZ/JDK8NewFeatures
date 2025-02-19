public class StacticMethodReferenece {

    /*
    * 静态方法的引用，就是lambda的方法体是某个静态方法的具体内容
    *   语法：类名::方法名
    * */
    public static void main(String[] args) {
        //正常Lambda表达式打印名字
        //在这里我们printable.print的具体实现就是打印，因此我们就直接方法引用打印方法
        sayHello("Karley",s -> System.out.println(s));
        //方法引用
        sayHello("Amy",System.out::println);

    }
    public static void sayHello(String name,Printable printable){
        printable.print(name);
    }
}
