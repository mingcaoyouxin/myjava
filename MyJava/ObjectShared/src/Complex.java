import java.math.BigInteger;
import java.util.Objects;

/**
 * Created by pc on 15-5-15.
 * 复数类
 */
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re,double im){
        this.re=re;
        this.im=im;
    }

    public double realPart(){return re;}
    public double imaginaryPart(){return im;}

    //加
    public Complex add(Complex c){
        return new Complex(re+c.re,im+c.im);
    }

    //减
    public Complex subtract(Complex c){
        return new Complex(re-c.re,im-c.im);
    }

   //乘
    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    //除
    public Complex divide(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re* c.im)/ tmp);
    }

    @Override
    public boolean equals(Object o){
        if(o==this)
            return true;
        if(!(o instanceof Complex))
            return false;
        Complex c= (Complex)o;
        return Double.compare(re,c.re)==0&&Double.compare(im,c.im)==0;//注意这里用的是compare而不是==
    }

    @Override
    public int hashCode(){
        int result=17+hashDouble(re);
        result=31*result+hashDouble(im);
        return result;
    }

    private int hashDouble(double val){
        //这里EffectiveJava中写的是 long longBits=Double.doubleToLongBits(re);个人由于没有看第二章书籍，暂时认为其笔误
        long longBits=Double.doubleToLongBits(val);
        return(int)(longBits^(longBits>>>32));
    }

    @Override
    public String toString(){
        return"("+re+"+"+im+"i)";
    }
}
