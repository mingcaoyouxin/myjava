import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by pc on 15-4-27.
 * 线程安全的计数器
 * 使用AtomicLong类型的变量来统计已处理请求的数量
 * AtomicLong是一种替代long类型整数的线程安全类
 */
@ThreadSafe
public class CountingFactorizer implements Servlet {
    private final AtomicLong count=new AtomicLong(0);

    public long getCount(){
        return count.get();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i=extractFromRequest(servletRequest);
        BigInteger[] factors=factor(i);
        count.incrementAndGet();//这里使用AtmoicLong类的方法，不使用count++。保证了原子操作，因为AtomicLong是现有的线程安全对象。
        encodeIntoResponse(servletResponse,factors);
    }

    private BigInteger extractFromRequest(ServletRequest servletRequest ) {
        //从请求中分离出BigInteger i
        return null;
    }
    private BigInteger[] factor(BigInteger i) {
        //返回分解的因数
        //...
        return null;
    }
    private void encodeIntoResponse(ServletResponse servletResponse, BigInteger[] factors) {
        //编码并返回

    }






    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }




    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
