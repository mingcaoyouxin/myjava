import com.util.ThreadSafe;

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
 *每个java对象都可以用做一个实现同步的锁，这些锁被称为内置锁或监视器锁。线程在进入同步代码块之前获得锁，并且在退出同步代码块时，自动释放锁。无论是通过正常的控制途径退出
 * 还是通过从代码块中抛出异常退出
 *
 * 下面的这种方法可以保证线程安全但是过于极端，因为多个客户端无法同时使用因数分解Servlet，服务器的响应性非常低，令人无法接受
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
