package factory_model.factory_method;

public class BananaFactory implements FruitFactory {

    public Fruit createFruit(){
        return new Banana();
    }

}
