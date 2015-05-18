import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by pc on 15-5-18.
 * 使用指向不可变容器对象的volatile类型引用以缓存最新的结果
 */
public class VolatileCachedFactorizer implements Servlet {
    private volatile OneValueCache cache=new OneValueCache(null,null);


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i=extractFromRequest(servletRequest);
        BigInteger[] factors=cache.getFactors(i);
        if(factors==null){
            factors=factor(i);
            cache=new OneValueCache(i,factors);
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
