import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by pc on 15-4-24.
 */
public class CountingFactorizer {
    private final AtomicLong count=new AtomicLong(0);
    public long getCount(){
        return count.get();
    }
    public void increament(){
        count.incrementAndGet();
    }
}
