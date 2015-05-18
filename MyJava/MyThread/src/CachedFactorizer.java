import com.util.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by pc on 15-5-11.
 * 注意与SynchronizedFactorizer的对比以及UnsafeCachingFactorizer
 * SynchronizedFactorizer将service方法设置为synchronized方法，虽然线程安全，但是代价很高。也就是导致了不良并发——可同时调用的数量，不仅受到可用资源的限制，还受到应用程序本身结构的限制。
 * 因为每次只有一个线程可以执行，这就背离了Servlet框架的初衷——需要能同时处理多个请求。
 * 如果Servlet在对某个大数值进行因数分解时需要很长的执行时间，那么其他的客户端必须一直等待，知道Servlet处理完当前的请求，才能开始另一个新的因数分解运算。
 *
 */
@ThreadSafe
public class CachedFactorizer implements Servlet {
    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private long hits;
    private long cacheHits;

    public synchronized long getHits(){return hits;}
    public synchronized double getCacheHitRatio(){
        return (double)cacheHits/(double)hits;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i=extractFromRequest(servletRequest);
        BigInteger[] factors=null;
        //第一个同步代码块负责保护判断是否只需返回缓存结果的“先检查后执行”操作序列
        synchronized (this){
            ++hits;
            if(i.equals(lastNumber)){
                ++cacheHits;
                factors=lastFactors.clone();
            }
        }
        //第二个同步代码块负责确保对缓存的数值和因数分解结果进行同步更新
        if(factors==null){
            factors=factor(i);
            synchronized (this){
                lastNumber=i;
                lastFactors=factors.clone();
            }
        }
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
