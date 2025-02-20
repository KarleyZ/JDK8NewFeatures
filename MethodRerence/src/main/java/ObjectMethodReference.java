public class ObjectMethodReference {

    public static void main(String[] args) {
        /*
        * 对象方法大的引用,引用的对象方法的参数列表和接口中的方法一致并且返回值兼容
        * 语法：
        *   对象名::方法名
        * */
        Student s = new Student("Karley");
        //lambda
        String result1 = getScore(s.getName(),100,(str,i)->{
            return "同学"+ str + "的成绩是" + i;
        });
        System.out.println(result1);
        //
        String result2 = getScore(s.getName(),98,s::getStudentScore);
        System.out.println(result2);
    }

    public static String getScore(String name, Integer score,StudentScore s){
       return s.printScore(name,score);
    }
}
