package decorator_model;

/**
 * 装饰者模式
 *
 * 装饰者模式在结构上与静态代理基本一致，但是不同的是，装饰者仅仅起一个装饰功能，
 * 也就是在目标类的相应方法执行前后增加一下效果，目标方法的执行与否不受装饰者控制。
 * 而代理模式中，目标类的相应方法是否执行是受代理人控制的。
 *
 */

public class Decorator implements BuyCar {

    private BuyCar buyCar;

    public Decorator(BuyCar buyCar){
        this.buyCar = buyCar;
    }

    public void buyCar(){
        System.out.println("装饰车内空间");
        buyCar.buyCar();
    }
}
