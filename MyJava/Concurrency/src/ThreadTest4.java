/**
 * Created by pc on 15-4-27.
 */
public class ThreadTest4  {
    Class Inner{
        private void unsynTest(){
            int i=5;
            while(i-->0){
                System.out.println(Thread.currentThread().getName()+":Inner.unsynTest()="+i);

            }
        }
    }
}




