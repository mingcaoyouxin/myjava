/**
 * Created by pc on 15-5-25.
 * 音响关闭命令
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
