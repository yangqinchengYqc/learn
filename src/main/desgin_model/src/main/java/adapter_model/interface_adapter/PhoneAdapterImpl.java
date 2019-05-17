package adapter_model.interface_adapter;

public class PhoneAdapterImpl extends PhoneAdapter {

    @Override
    public void playGame(){
        System.out.println("play game");
    }

    @Override
    public void watchVideo(){
        System.out.println("watch video");
    }
}
