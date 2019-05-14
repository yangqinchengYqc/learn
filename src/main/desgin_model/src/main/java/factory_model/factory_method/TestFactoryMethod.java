package factory_model.factory_method;

/**
 * 工厂方法与简单工厂相比，将工厂类抽象成了一个水果工厂，
 * 再创建具体的苹果工厂和香蕉工厂去创建相应的水果。
 *
 * 优点，解决了开闭原则，适用于类型不多的情况
 * 缺点，当需要增加新类型的时候需要重新创建一个对应的工厂，
 * 如果需要的产品很多的话，需要创建非常多的工厂。
 */
public class TestFactoryMethod {

    public static void main(String[] args){
        FruitFactory fruitFactory = new AppleFactory();
        Fruit apple = fruitFactory.createFruit();
        apple.whatIm();

        fruitFactory = new BananaFactory();
        Fruit banana = fruitFactory.createFruit();
        banana.whatIm();

    }
}
