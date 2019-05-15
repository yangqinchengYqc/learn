package agent_model.static_agent;

import java.util.Random;

/**
 * 静态代理模式
 *
 * 1、可以在不修改BuyCarImpl的情况下对buyCar方法扩展，添加一下新的内容。
 *
 * 2、因为代理类和目标类都实现了接口，当接口修改的时候，代理类和目标类都要修改。
 * 无法代理目录类特有的方法，如需带来这类方法，代理类就不能使用多态，而是去专门代理该目标类才行
 * 这样会造成代理类非常多，不易管理，工作量也大。
 *
 * 3、装饰者模式在结构上与静态代理基本一致，但是不同的是，装饰者仅仅起一个装饰功能，
 * 也就是在目标类的相应方法执行前后增加一下效果，目标方法的执行与否不受装饰者控制。
 * 而代理模式中，目标类的相应方法是否执行是受代理人控制的。
 *
 */
public class BuyCarProxy implements BuyCar {

    private BuyCar buyCar;

    public BuyCarProxy(BuyCar buyCar){
        this.buyCar = buyCar;
    }

    public void buyCar(){
        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("代理人前去购车...");
            buyCar.buyCar();
        }
        else {
            System.out.println("代理人有事情，不购车了...");
        }
    }

    public void tryCar(){
        buyCar.tryCar();
    }

}
