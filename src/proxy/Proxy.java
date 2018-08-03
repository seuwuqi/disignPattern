package proxy;

/**
 * @program: untitled
 * @description: proxy
 * @author: wuqi
 * @create: 2018-08-01 17:13
 **/
public class Proxy implements FoodMaker {
    Target target = new Target();

    @Override
    public void makefood() {
        System.out.println("preparing");
        target.makefood();
        System.out.println("complete");
    }

    public static void main(String[] args) {
        FoodMaker foodMaker = new Proxy();
        foodMaker.makefood();
    }

}
