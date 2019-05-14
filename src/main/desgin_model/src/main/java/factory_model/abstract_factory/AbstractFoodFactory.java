package factory_model.abstract_factory;

public interface AbstractFoodFactory {

    StapleFood createStapleFood(String type); //创建主食

    Fruit createFruit(String type); //创建水果

}
