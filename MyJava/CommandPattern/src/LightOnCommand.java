/**
 * Created by pc on 15-5-25.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){

        //构造器被传入了某个电灯（比方说：客厅的电灯），以便让这个命令控制，然后记录在实例变量中，一旦调用execute方法就由这个电灯对象称为接收者，负责接受请求
        this.light=light;
    }


    @Override
    public void execute() {
        light.on();//调用接收对象（我们正在控制的电灯）的on方法
    }
}
