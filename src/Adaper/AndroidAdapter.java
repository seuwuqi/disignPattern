package Adaper;

/**
 * @program: untitled
 * @description: 安卓适配器
 * @author: wuqi
 * @create: 2018-08-01 19:57
 **/
public class AndroidAdapter implements Android {

    private Apple apple = new Apple();


    @Override
    public void androidCharge() {
        apple.charge();
    }

    public static void main(String[] args) {
        new AndroidAdapter().androidCharge();
    }
}
