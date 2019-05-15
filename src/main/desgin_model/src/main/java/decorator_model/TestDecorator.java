package decorator_model;

public class TestDecorator {
    public static void main(String[] args){

        BuyCar buyCar = new BuyCarImpl();

        Decorator decorator = new Decorator(buyCar);

        decorator.buyCar();
    }
}
