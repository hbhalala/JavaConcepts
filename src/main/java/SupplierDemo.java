import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    /*
    @Override
    public String get() {
        return "hello from supplier";
    }
     */

    public static void main(String[] args) {
        //Supplier<String> s = new SupplierDemo();

        //Supplier<String> s = () -> "hello from supplier";
        //System.out.println(s.get());

        List<String> list1 = Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(() -> "hello from supplier"));
    }
}
