package adapter_model.Object_adapter;

import adapter_model.Iphone;

/**
 * 对象适配器模式
 */
public class IphoneAdapter extends AndroidCharger {

    private Iphone iphone;

    public IphoneAdapter(Iphone iphone){
        this.iphone = iphone;
    }

    @Override
    public void charger(){
        this.iphone.iphoneCharging();
    }

}
