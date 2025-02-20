import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {
        //forEach:遍历元素
        Stream<String> stream1 = Stream.of("离仑","赵远舟","卓翼宸");
        stream1.forEach(s -> System.out.println(s));

        // count:元素个数计数,记住返回的是Long类型
        Long count = stream1.count();
    }
}
