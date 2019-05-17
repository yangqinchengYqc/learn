package adapter_model.class_adapter;

import adapter_model.Iphone;

public class IphoneClassAdapter extends Iphone implements AndroidClassCharge {

    public void charger(){
        super.iphoneCharging();
    }
}
