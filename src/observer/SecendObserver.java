package observer;

/**
 * @program: untitled
 * @description: 观察者2
 * @author: wuqi
 * @create: 2018-08-01 23:33
 **/
public class SecendObserver extends Observer {

    public SecendObserver(Subject subject) {
        this.subject = subject;

    }

    @Override
    public void react() {
        System.out.println("观察者2收到啦");
    }

    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }
}
