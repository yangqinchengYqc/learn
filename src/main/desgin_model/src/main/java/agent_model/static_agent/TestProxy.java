package agent_model.static_agent;

public class TestProxy {

    public static void main(String[] args){

        BuyCar buyCar = new BuyCarImpl();

        BuyCarProxy proxy = new BuyCarProxy(buyCar);

        proxy.buyCar();
    }

}
