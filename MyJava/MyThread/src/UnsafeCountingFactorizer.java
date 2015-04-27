import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by dh on 15-4-25.
 */
@NotThreadSafe
public class UnsafeCountingFactorizer implements Servlet {
    private long count=0;
    public long getCount(){return count;}

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i= extractFromRequest(servletRequest);
        BigInteger[] factors=factor(i);
        //这里是线程不安全的，因为++count是一个“读取、修改、写入”的操作序列，并且其结果状态依赖于之前的状态，存在竞态条件
        //竞态条件，也就是结果要取决于运气，最常见的竞态条件类型就是“先检查后执行”操作，即通过一个可能失效的观测结果来决定下一步的动作
        //其本质就是说，基于一种可能失效的观察结果来做出判断或者执行某个计算。
        ++count;

        encodeIntoResponse(servletResponse,factors);
    }

    private void encodeIntoResponse(ServletResponse servletResponse, BigInteger[] factors) {
        //编码并返回

    }

    private BigInteger[] factor(BigInteger i) {
        //返回分解的因数
        //...
        return null;
    }

    private BigInteger extractFromRequest(ServletRequest servletRequest ) {
        //从请求中分离出BigInteger i
        return null;
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
