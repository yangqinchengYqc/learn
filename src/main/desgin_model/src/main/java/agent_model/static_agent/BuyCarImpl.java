package agent_model.static_agent;

public class BuyCarImpl implements BuyCar {

    public void buyCar(){
        System.out.println("买了凯迪拉克！");
    }

    public void tryCar(){
        System.out.println("试驾凯迪拉克！");
    }

    //特有的方法，代理类无法代理该方法，需要实现一个特殊的代理类专门代理BuyCarImpl才能代理该方法
    public void buySurrounding(){
        System.out.println("购买凯迪拉克的周边");
    }
}
