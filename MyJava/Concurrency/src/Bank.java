/**
 * Created by pc on 15-4-28.
 * 模拟银行的存款和取款
 *注意当线程在执行某实例的一个同步方法，同时阻塞该线程的其他同步方法，也就是其他线程也不能执行其他的同步方法，只能执行非同步方法
 * 也就是说某线程如果锁定，就锁定了所有的同步方法。当然，这只是针对一个实例，不是因为说某个实例的synchronized方法正在执行，导致无法执行其他实例的synchronized方法。
 *
 */
public class Bank {
    private int money;
    private int unitId;

    public Bank(int unitId,int money){
        this.unitId=unitId;
        this.money=money;
    }
    //存款
    public synchronized void deposit(int amount){
        this.money+=amount;
    }
    //取款
    public synchronized  boolean withdraw(int amount){
        if(amount<money){
            System.out.println("not enough");
            return false;
        }
        else{
            money-=amount;
            return  true;
        }
    }
}
