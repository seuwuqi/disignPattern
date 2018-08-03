package decorator;

/**
 * @program: untitled
 * @description: ..
 * @author: wuqi
 * @create: 2018-08-01 23:19
 **/
public class MiaoZhun extends Decoretor{

    private Gun gun;

    public MiaoZhun(Gun gun) {
        this.gun = gun;
    }

    @Override
    void shot() {
        System.out.println("安装瞄准镜");
        gun.shot();
    }
}
