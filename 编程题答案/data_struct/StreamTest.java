package data_struct;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        
        Stream<Integer> s = Stream.generate(new Supplier<Integer>() {
            int n = 0;
            @Override
            public Integer get() {
                n += 1;
                return n;
            }
        });
        Stream<Integer> t = s.filter((i)->{return i%2 == 0;}).skip(500000000);
        System.out.println(t.findFirst());
    }
}
