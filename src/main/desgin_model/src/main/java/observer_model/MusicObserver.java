package observer_model;

public class MusicObserver implements Observer {

    private String name;

    private String message;

    public MusicObserver(String name){
        this.name = name;
    }

    public void update(String message){
        this.message = message;
        System.out.println(name + "收到： " + message);
    }
}
