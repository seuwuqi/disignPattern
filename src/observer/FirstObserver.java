package observer;

/**
 * @program: untitled
 * @description: 观察者1
 * @author: wuqi
 * @create: 2018-08-01 23:33
 **/
public class FirstObserver extends Observer{

    public FirstObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void react() {
        System.out.println("观察者1收到消息了");
    }

    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }
}
