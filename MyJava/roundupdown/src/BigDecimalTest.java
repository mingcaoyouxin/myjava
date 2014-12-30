import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by dhao on 14-11-25.
 */
public class BigDecimalTest {
    public static void  main(String  args[]){
        /*BigDecimalTest format =  new  BigDecimalTest();
        System.out .println(format.doubleOutPut(12.345, 2));//12.35
        System.out .println(format.roundNumber(12.335, 2));//12.34*/

        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        percent.setMaximumFractionDigits(3); //百分比小数点最多3位

        BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额
        BigDecimal interestRate = new BigDecimal("0.008"); //利率
        BigDecimal interest = loanAmount.multiply(interestRate); //相乘

        System.out.println("贷款金额:\t" + currency.format(loanAmount));
        System.out.println("利率:\t" + percent.format(interestRate));
        System.out.println("利息:\t" + currency.format(interest));

    }
    public   String  doubleOutPut(double  v,Integer num){
        if ( v == Double.valueOf(v).intValue()){
            return  Double.valueOf(v).intValue() +  "" ;
        }
        else {
            BigDecimal b =  new  BigDecimal(Double.toString(v));
            return  b.setScale(num,BigDecimal.ROUND_HALF_UP ).toString();
        }
    }
    public   String  roundNumber(double  v,int  num){
        String  fmtString =  "0000000000000000" ;  //16bit
        fmtString = num>0 ?  "0."   + fmtString.substring(0,num):"0" ;
        DecimalFormat dFormat =  new  DecimalFormat(fmtString);
        return  dFormat.format(v);
    }
}
