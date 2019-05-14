package factory_model.factory_method;

public class AppleFactory implements FruitFactory {

    public Fruit createFruit(){
        return new Apple();
    }
}
