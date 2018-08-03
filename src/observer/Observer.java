package observer;

/**
 * @program: untitled
 * @description: 观察者
 * @author: wuqi
 * @create: 2018-08-01 23:31
 **/
public abstract class Observer {

    protected Subject subject;
    public abstract void react();
    public abstract void subscribe(Subject subject);
}
