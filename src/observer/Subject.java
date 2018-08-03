package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: untitled
 * @description: 主题
 * @author: wuqi
 * @create: 2018-08-01 23:31
 **/
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void update(){
        send();
    }

    public void send(){
        for (Observer observer: observers) {
            observer.react();
        }
    }

    public static void main(String[] args) {
        List<Observer> observers = new ArrayList<>();
        Subject subject = new Subject();
        Observer observer1 = new FirstObserver(subject);
        observer1.subscribe(subject);
        Observer observer2 = new SecendObserver(subject);
        observer2.subscribe(subject);
        subject.send();
    }
}
