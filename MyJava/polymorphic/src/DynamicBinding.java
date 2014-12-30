/**
 * Created by huoweiguang on 14-11-30.
 */
public class DynamicBinding
{
    public static void main(String args[])
    {
        Vehicle vehicle = new Car(); //here Type is vehicle but object will be Car
        vehicle.start();       //Car's start called because start() is overridden method
    }
}

class Vehicle
{
    public void start()
    {
        System.out.println("Inside start method of Vehicle");
    }
}
class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Inside start method of Car");
    }
}
/*
* output:
* Inside start method of Car
* */