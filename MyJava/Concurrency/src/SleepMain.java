/**
 * Created by pc on 15-4-28.
 * 每隔1s输出“Good！”
 * Sleep方法要被放在try-catch里面，sleep方法可能会抛出一个称为InterruptedException的异常。InterruptedException是用在取消线程处理时的异常。
 * 被Thread.sleep暂停的线程，可利用interrupt方法半路唤醒
 */
public class SleepMain  {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("Good!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
