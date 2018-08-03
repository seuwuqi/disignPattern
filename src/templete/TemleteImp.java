package templete;

/**
 * @program: untitled
 * @description: 自雷
 * @author: wuqi
 * @create: 2018-08-02 00:07
 **/
public class TemleteImp extends Templete{

    @Override
    public void apply() {
        System.out.println("主题部分");
    }

    @Override
    public void end() {
        System.out.println("子类自定义end方法");
    }

    public static void main(String[] args) {
        TemleteImp temleteImp = new TemleteImp();
        temleteImp.templeteMethod();
    }
}
