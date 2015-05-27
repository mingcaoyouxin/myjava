/**
 * Created by pc on 15-5-25.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
