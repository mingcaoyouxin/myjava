/**
 * Created by pc on 15-4-28.
 */
public class MainPrinter {
    public static void main(String[] args) {
        new Thread(new Printer("good")).start();
        new Thread(new Printer("nice")).start();
    }
}
