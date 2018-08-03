package templete;

/**
 * @program: untitled
 * @description: 模板
 * @author: wuqi
 * @create: 2018-08-02 00:04
 **/

/*
模板方法只负责定义第一步应该要做什么，第二步应该做什么，第三步应该做什么，至于怎么做，由子类来实现。
 */
public abstract class Templete {

    public void templeteMethod(){
        init();
        apply();
        end();
    }
    public void init(){
        System.out.println("inital");
    }

    public abstract void apply();

    public void end(){

    }
}
