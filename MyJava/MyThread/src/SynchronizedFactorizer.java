import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by pc on 15-4-27.
 * Java提供了一种内置的锁机制来支持原子性：同步代码块。同步代码块包括两部分：锁的对象引用、这个锁保护的同步代码块
 * sychronized(lock){
 *     //访问或修改由锁保护的共享状态
 * }
 *
 */
@ThreadSafe
public class SynchronizedFactorizer implements Servlet {

    private final AtomicReference<BigInteger> lastNumber=new AtomicReference<BigInteger>();
    private final AtomicReference<BigInteger[]> lastFactors=new AtomicReference<BigInteger[]>();



    @Override
    public synchronized void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i=extractFromRequest(servletRequest);
        if(i.equals(lastNumber.get()))
            encodeIntoResponse(servletResponse,lastFactors.get());
        else{
            BigInteger[] factors=factor(i);
            lastNumber.set(i);
            lastFactors.set(factors);
            encodeIntoResponse(servletResponse,factors);
        }
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
