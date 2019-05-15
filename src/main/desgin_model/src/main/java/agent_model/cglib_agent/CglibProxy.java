package agent_model.cglib_agent;

import agent_model.static_agent.BuyCar;
import agent_model.static_agent.BuyCarImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

public class CglibProxy implements MethodInterceptor {

    private Object object;

    public Object getInstance(final Object o){
        this.object = o;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.object.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable{
        Random rand = new Random();
        Object result = new Object();
        if (rand.nextBoolean()) {
            System.out.println("代理人前去购车...");
            result = methodProxy.invoke(this.object,args);
        }
        else {
            System.out.println("代理人有事情，不购车了...");
        }

        return result;
    }


    public static void main(String[] args){

        BuyCar buyCar = new BuyCarImpl();

        CglibProxy cglibProxy = new CglibProxy();
        BuyCarImpl proxy = (BuyCarImpl)cglibProxy.getInstance(buyCar) ;
        proxy.buyCar();

    }

}
