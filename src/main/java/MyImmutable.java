import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MyImmutable {
    private final int number;
    private final List<String> addresses = new ArrayList<String>();

    public MyImmutable(int number, List<String> addresses) {
        this.number = number;
        Collections.copy(this.addresses, addresses);
    }

    public int getNumber() {
        return number;
    }

    public List<String> getAddresses() {
        List<String> ret = new ArrayList<String>();
        Collections.copy(ret, addresses);
        return ret;
    }
}
