package factory_model.simple_factory;

/**
 * 简单工厂模式
 *
 * 适用类型较少的时候
 * 当需要增加一种新的水果桃子时需要修改SimpleFactory的代码，这个不符合开闭原则
 */
public class SimpleFactory {

    public static Fruit createFruit(String type){
        Fruit fruit = null;
        if (type.equals("apple")){
            fruit = new Apple();
        }
        if (type.equals("banana")){
            fruit = new Banana();
        }
        return fruit;
    }


    public static void main(String[] args){

        Fruit fruit = SimpleFactory.createFruit("apple");
        fruit.whatIm();
    }
}
