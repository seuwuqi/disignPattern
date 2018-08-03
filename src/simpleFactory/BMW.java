package simpleFactory;

/**
 * @program: untitled
 * @description: bmw
 * @author: wuqi
 * @create: 2018-08-01 14:25
 **/
public class BMW implements Car{


    @Override
    public void run() {
        System.out.println("bmw 跑的慢");
    }
}
