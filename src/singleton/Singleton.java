package singleton;

/**
 * @program: untitled
 * @description: 单例
 * @author: wuqi
 * @create: 2018-08-01 14:55
 **/
public class Singleton {
    private void Singleton(){

    };
    private static volatile Singleton singleton;

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args){
        Singleton3 instance = Singleton3.getInstance();
    }
}

class Singleton3 {

    private Singleton3(){

    }

    private static class Holder{
        public  static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return Holder.instance;
    }

}
