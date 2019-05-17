package adapter_model;

import adapter_model.Object_adapter.AndroidCharger;
import adapter_model.Object_adapter.IphoneAdapter;
import adapter_model.class_adapter.AndroidClassCharge;
import adapter_model.class_adapter.IphoneClassAdapter;
import adapter_model.interface_adapter.Phone;
import adapter_model.interface_adapter.PhoneAdapterImpl;

public class TestAdapter {

    /**
     * 对象适配器模式，采用组合的方式进行实现，IphoneAdapter适配器中组合了iphone，继承了AndroidCharger。
     * 重新实现了充电方法charger()。
     */
    public static void TestObjectAdapter(){
        Iphone iphone = new Iphone(); //有一个iphone，现在需要充电。
        AndroidCharger androidCharger = new IphoneAdapter(iphone); //使用适配器去适配安卓充电器
        androidCharger.charger(); //iphone进行充电
    }

    /**
     * 类适配器模式，采用继承实现。适配器需要继承iphone类，再去实现AndroidClassCharge的充电接口。
     */
    public static void testClassAdapter(){
        AndroidClassCharge androidClassCharge = new IphoneClassAdapter();
        androidClassCharge.charger();
    }

    /**
     * 接口适配器模式，首先是有个接口，创建一个抽象类去实现这个接口，在创建一个具体的类
     * 继承这个抽象类，并实现想要重新实现的方法。
     *
     * 使用场景：
     * 想要使用接口中的某个或某些方法，但是接口中有太多方法，我们要使用时必须实现接口
     * 并实现其中的所有方法，可以使用抽象类来实现接口，并不对方法进行实现（仅置空），
     * 然后我们再继承这个抽象类来通过重写想用的方法的方式来实现。这个抽象类就是适配器。
     */
    public static void testInterfaceAdapter(){
        Phone phone = new PhoneAdapterImpl();
        phone.playGame();
        phone.watchVideo();
    }


    public static void main(String[] args){

        TestObjectAdapter();

        testClassAdapter();

        testInterfaceAdapter();
    }

}
