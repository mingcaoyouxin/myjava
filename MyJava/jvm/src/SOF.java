/**
 * Created by pc on 14-11-27.
 */
public class SOF
{
    public static void main(String[] args)
    {
        try
        {   // invoke foo() with a simulated call depth
            SOF.foo(1,5);
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static void foo(int n, int limit) throws Exception
    {
        try
        {   // simulate a depth limited call stack
            String tryStr=n + " - Try";
            System.out.println(tryStr);
            if (n < limit)
                foo(n+1,limit);
            else
                throw new Exception("StackOverflow@try("+n+")");
        }
        finally
        {
            String finallyStr=n + " - Finally";
            System.out.println(finallyStr);
            if (n < limit)
                foo(n+1,limit);
            else
                throw new Exception("StackOverflow@finally("+n+")");
        }
    }
}
