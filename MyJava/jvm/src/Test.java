import java.net.SocketPermission;

/**
 * Created by pc on 14-11-25.
 */
public class Test implements Super{

    private static final int staticVar = 0;

    private int instanceVar=0;

    public int instanceMethod(int param){
        return param+1;
    }

}

interface Super{ }