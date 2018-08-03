package decorator;

/**
 * @program: untitled
 * @description: 子弹
 * @author: wuqi
 * @create: 2018-08-01 23:18
 **/
public class Bullet extends Decoretor {
    private Gun gun;

    public Bullet(Gun gun) {
        this.gun = gun;
    }

    @Override
    void shot() {
        System.out.println("安装子弹");
        gun.shot();
    }
}
