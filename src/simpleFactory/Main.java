package simpleFactory;

/**
 * @program: untitled
 * @description: main
 * @author: wuqi
 * @create: 2018-08-01 14:28
 **/
public class Main {

    public static void main(String[] args){
        CarFactory factory = new CarFactory();
        String audi = new String("audi");
        Car car = factory.newCar(audi);
        car.run();
    }

}
