/**
 * Created by huoweiguang on 14-11-30.
 */

/*演奏的乐符*/
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

//音乐类
public class Music {

    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // 向上转型
    }
}

//演奏乐器导出类Wind
class Wind extends Instrument {
    //重写基类方法
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

//演奏乐器基类
class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}
/*
* output:
* Wind.play() MIDDLE_C
* */