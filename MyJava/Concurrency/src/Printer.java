/**
 * Created by pc on 15-4-28.
 */
public class Printer implements Runnable {
    private String message;
    public Printer(String message){
        this.message=message;
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            System.out.println(message);
        }
    }
}
