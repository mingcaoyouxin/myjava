import com.util.NotThreadSafe;

/**
 * Created by dh on 15-4-25.
 * "先检查后执行"一种常见情况就是延迟初始化，目的就是将对象的操作推迟到实际使用时才执行。同时要确保只被初始化一次。
 */
@NotThreadSafe
public class LazyInitRace {
    private ExpensiveObject instance=null;

    public ExpensiveObject getInstance(){
        if(instance==null)
            instance= new ExpensiveObject();
        return instance;
    }
}


