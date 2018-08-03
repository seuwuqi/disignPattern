package proxy;

/**
 * @program: untitled
 * @description: 目标对象
 * @author: wuqi
 * @create: 2018-08-01 17:09
 **/
public class Target implements FoodMaker{


    @Override
    public void makefood() {
        System.out.println("making food");
    }
}
