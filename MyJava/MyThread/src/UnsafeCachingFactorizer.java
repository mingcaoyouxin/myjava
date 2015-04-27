import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by pc on 15-4-27.
 * 加锁机制来保证同步，首先看一个线程不安全的类，在类中CountingFactorizer中，我们使用了线程安全的对象AtomicLong来管理Servlet的状态，以维护Servlet的线程安全性,
 * 但是注意：一个原子操作时线程安全的，但是多个原子操作组合在一起，并不一定是线程安全的，如下面的实现
 * 该类的需求是：提升Servlet的性能，将最近的计算结果缓存起来，当两个连续的请求对相同的数值进行因数分解时，可以直接使用上一次的计算结果，而无须重新计算。
 * AtomicReference是一种替代对象引用的线程安全类
 */
public class UnsafeCachingFactorizer implements Servlet {
    private final AtomicReference<BigInteger> lastNumber=new AtomicReference<BigInteger>();
    private final AtomicReference<BigInteger[]> lastFactors=new AtomicReference<BigInteger[]>();


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i=extractFromRequest(servletRequest);
        if(i.equals(lastNumber.get()))
            encodeIntoResponse(servletResponse,lastFactors.get());
        else{
            BigInteger[] factors=factor(i);
            //下面两个语句不是线程安全的。因为线程安全性要求：多个线程之间的操作无论采用何种执行时序或者交替方式，都要保证不变性条件不被破坏。
            //当在不变形条件中涉及多个变量时，各个变量之间并不是相互独立的，而是某个变量的值会对其他变量的值产生约束。因此，当更新一个变量时，需要在同一个原子操作中对其他变量同时进行更新。
            //比如这里的lastNumber等于lastFactors中元素的乘积。两者不是彼此对立的，因此要放在一个原子操作中同时更新。
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
