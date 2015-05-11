import com.util.ThreadSafe;

/**
 * Created by pc on 15-5-11.
 * 仅对set方法进行同步是不够的，调用get的线程仍然会看见失效值，因此需要对get与set均进行同步
 */
@ThreadSafe
public class SynchronizedInteger {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }


}
