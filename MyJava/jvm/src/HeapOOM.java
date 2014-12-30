import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 14-11-25.
 */
public class HeapOOM {
    static class OOMObject{

    }
    public static void main(String [] args){
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.substring(0, name.indexOf("@"));
        System.out.println(pid);
        String[] cmd = { "jmap ", "-dump:file=E:\\code\\src\\Java\\jvm\\heap\\dump\\dump1.bin", pid };
        try {
            Process p = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<OOMObject> list=new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }

    }
}
