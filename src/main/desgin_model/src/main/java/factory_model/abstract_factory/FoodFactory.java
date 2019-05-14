package factory_model.abstract_factory;

/**
 * 抽象工厂模式
 *1、说明
 * 当然实现抽象工厂模式的方式有很多，可以根据传入的type来创建对应的类型，
 * 也可以创建包含创建的rice和apple方法的工厂去实现对rice和apple的生成，
 * 和创建包含创建的noodles和banana方法的工厂去实现对noodles和banana的生成，
 *
 *2、优点
 * 抽象工厂模式融合了简单工厂和工厂方法这两个模式。
 * 抽象工厂可以创建多个不同种类的对象，这个模式适用于对象种类繁多的情况
 *
 *3、缺点
 * 抽象工厂模式很难支持新种类产品的变化。这是因为抽象工厂接口中已经确定了可以
 * 被创建的产品集合，如果需要添加新产品，此时就必须去修改抽象工厂的接口，这样
 * 就涉及到抽象工厂类的以及所有子类的改变，这样也就违背了“开发——封闭”原则。
 */
public class FoodFactory implements AbstractFoodFactory{

    public StapleFood createStapleFood(String type){//创建主食
        StapleFood stapleFood = null;
        if (type.equals("rice")){
            stapleFood = new Rice();
        }
        if (type.equals("noodles")){
            stapleFood = new Noodles();
        }
        return stapleFood;
    }

    public Fruit createFruit(String type){ //创建水果
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

        FoodFactory foodFactory = new FoodFactory();

        Fruit apple = foodFactory.createFruit("apple");
        apple.whatIm();
        StapleFood rice = foodFactory.createStapleFood("rice");
        rice.whatIm();

        Fruit banana = foodFactory.createFruit("banana");
        banana.whatIm();
        StapleFood noodles = foodFactory.createStapleFood("noodles");
        noodles.whatIm();

    }
}
