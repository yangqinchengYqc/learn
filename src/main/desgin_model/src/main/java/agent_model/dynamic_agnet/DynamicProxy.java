package agent_model.dynamic_agnet;

import agent_model.static_agent.BuyCar;
import agent_model.static_agent.BuyCarImpl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 动态代理模式
 *
 * 在动态代理中我们不再需要再手动的创建代理类，我们只需要编写一个动态处理器就可以了。
 * 真正的代理对象由JDK再运行时为我们动态的来创建。
 *
 * 注意Proxy.newProxyInstance()方法接受三个参数：
 *
 * ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
 * Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
 * InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
 *
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
        Random rand = new Random();
        Object result = new Object();
        if (rand.nextBoolean()) {
            System.out.println("代理人前去购车...");
            result = method.invoke(this.object,args);
        }
        else {
            System.out.println("代理人有事情，不购车了...");
        }
        return result;
    }

    public static void main(String[] args){

        BuyCar buyCar = new BuyCarImpl();

        BuyCar proxy = (BuyCar) Proxy.newProxyInstance(BuyCar.class.getClassLoader(),new Class[]{BuyCar.class},new DynamicProxy(buyCar));

        proxy.buyCar();

    }
}
