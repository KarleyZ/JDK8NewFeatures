import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {
        //filter:过滤元素
        Stream<String> stream1 = Stream.of("离仑","赵远舟","卓翼宸");
        stream1.filter(name->name.length()>=3).forEach(s -> System.out.println(s));

        //map:将元素进行映射。例如将String映射为Integer
        Stream<String> stream2 = Stream.of("1","2","3","4","5","6");
        stream2.map(s -> Integer.parseInt(s)).forEach(i -> System.out.print(i + " "));

        System.out.println();
        System.out.println("===========================");

        //collection收集器
        List<String> list = new ArrayList<>();
        list.add("宫尚角");
        list.add("宫紫商");
        list.add("宫子羽");
        list.add("宫远徵");
        list.add("宫二");
        list.add("云为衫");
        list.add("金繁");
        list.add("雪重子");

        //将以宫开头并且名字大于3的名字收集到List集合中并遍历
        Stream<String> stream3 = list.stream();
        //Collector是收集器，是将结果收集到list中
        List<String> name1 = stream3.filter(s -> s.startsWith("宫")).filter(s-> s.length()>=3).collect(Collectors.toList());
        name1.stream().forEach(s-> System.out.print(s + " "));

        System.out.println();
        System.out.println("===========================");

        Set<Integer> set = new HashSet<>();
        set.add(21);
        set.add(56);
        set.add(45);
        set.add(26);
        set.add(31);
        //将年龄大于35的收集到set集合中并遍历
        Set<Integer> age = set.stream().filter(i-> i>=35).collect(Collectors.toSet());
        set.stream().forEach(i-> System.out.print(age));

        System.out.println();
        System.out.println("===========================");

        String[] strings = {"卓翼宸，24","赵远舟，3000","英磊，271"};
        //将上述字符串收集到map中
        Stream<String> stream4 = Stream.of(strings);
        Map<String,Integer> map = stream4.collect(Collectors.toMap(s->s.split("，")[0],s->Integer.parseInt(s.split("，")[1])));
        map.values().stream().forEach(i-> System.out.print(i+","));

        System.out.println();
        System.out.println("===========================");

        //skip:跳过元素，输入几个就跳过几个
        list.stream().skip(3).forEach(s-> System.out.print(s +" "));

        System.out.println();
        System.out.println("===========================");

        //concat连接两个流,泛型要一致
        Stream<String> stream5 = Stream.of("A","B","C");
        Stream<String> stream6 = Stream.of("1","2","3","4");
        Stream<String> stream7 = Stream.concat(stream5,stream6);
        stream7.forEach(s-> System.out.print(s + ","));

    }
}
