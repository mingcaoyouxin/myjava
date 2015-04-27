import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by dh on 15-4-25.
 * StatelessFactorizer是无状态的，既不包含任何域，也不包含任何对其他类中的域的引用。
 * 计算过程中的临时状态，如factors仅存于线程栈上的局部变量中，并且只能由正在执行的线程访问。
 * 多个线程之间没有共享状态，因此一定是线程安全的。
 * 对象的状态：存储在状态变量（比如实例或静态域）中的数据
 * 无状态对象一定是线程安全的
 */
@ThreadSafe
public class StatelessFactorizer  implements Servlet {



    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //
        BigInteger i=extractFromRequest(servletRequest);//从请求中提取BigInteger i
        BigInteger[] factors=factor(i);//对i进行因数分解
        encodeIntoResponse(servletResponse,factors);//将因数返回
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
