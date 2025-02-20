import java.util.*;
import java.util.stream.Stream;

public class GetStreamOperations {

    public static void main(String[] args) {
        /*
         * 获取流
         * */
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<Integer> set = new HashSet<>();
        Stream<Integer> stream2 = set.stream();

        Map<String, Integer> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();

        Stream<Map.Entry<String,Integer>> stream4 = map.entrySet().stream();

        Collection<Integer> collection = map.values();
        Stream<Integer> steam5 = collection.stream();

        Integer[] arr = {1,2,3,4,5,6};
        Stream<Integer> stream6 = Stream.of(arr);
    }
}
