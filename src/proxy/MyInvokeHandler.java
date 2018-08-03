package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

/**
 * @program: untitled
 * @description: invokehandler
 * @author: wuqi
 * @create: 2018-08-01 17:19
 **/

/**
 * 使用动态代理的五大步骤
 * 1.通过实现InvocationHandler接口来自定义自己的InvocationHandler;
 *
 * 2.通过Proxy.getProxyClass获得动态代理类
 *
 * 3.通过反射机制获得代理类的构造方法，方法签名为getConstructor(InvocationHandler.class)
 *
 * 4.通过构造函数获得代理对象并将自定义的InvocationHandler实例对象传为参数传入
 *
 * 5.通过代理对象调用目标方法
 */
public class MyInvokeHandler implements InvocationHandler {

    Object target;

    public MyInvokeHandler(Target target) {
        this.target = target;
    }

    public Object getProxy(){
       return newProxyInstance(Target.class.getClassLoader(),
                Target.class.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Preparing");
        method.invoke(target,args);
        return target;
    }

    public static void main(String[] args) {
        MyInvokeHandler myInvokeHandler = new MyInvokeHandler(new Target());
        FoodMaker target = (FoodMaker) Proxy.newProxyInstance(Target.class.getClassLoader(),
                Target.class.getInterfaces(), myInvokeHandler);

        target.makefood();
    }
}
