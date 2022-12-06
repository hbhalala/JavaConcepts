import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        /*
        Predicate<Integer> p = integer -> integer%2==0;
        System.out.println(p.test(2));
         */

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().filter(t->t%2==0).forEach((t) -> System.out.println("value = " + t));
    }
}
