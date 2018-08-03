package simpleFactory;

/**
 * @program: untitled
 * @description: 汽车工厂
 * @author: wuqi
 * @create: 2018-08-01 14:23
 **/
public class CarFactory {

    public Car newCar(String name){
        switch (name){
            case "audi":
                return newAudi();
            case "bmw":
                return newBMW();
            default:
                return null;
        }

    }
    public Car newAudi(){
        return new Audi();
    }

    public Car newBMW(){
        return new BMW();
    }
}
