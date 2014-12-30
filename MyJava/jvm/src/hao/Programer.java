package hao;

/**
 * Created by pc on 14-12-12.
 */
public class Programer extends Person {

    static String company = "CompanyA";

    static{
        System.out.println("staitc init");
    }


    String position;
    Computer computer;

    public Programer() {
        this.position = "engineer";
        this.computer = new Computer();
    }

    public void working(){
        System.out.println("coding...");
        computer.working();
    }
}