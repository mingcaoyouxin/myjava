import com.util.NotThreadSafe;

/**
 * Created by pc on 15-5-11.
 * 非线程安全的可变整数类
 *这里也是线程不安全的，因为get和set都没有在同步的情况下访问value，会出现失效值的问题，如果某个线程调用了set，那么另一个调用get的线程可能会看到更新后的value值，也可能看不到
 */

@NotThreadSafe
public class MutableInteger {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
