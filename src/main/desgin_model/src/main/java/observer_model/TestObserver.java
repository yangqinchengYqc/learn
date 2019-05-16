package observer_model;

public class TestObserver {

    public static void main(String[] args){

        MusicSubject subject = new MusicSubject();

        Observer observerA = new MusicObserver("A");
        Observer observerB = new MusicObserver("B");

        subject.registerObserver(observerA);
        subject.registerObserver(observerB);

        subject.setMessage("music party开始了!");

        subject.notifyObserver();
    }
}
