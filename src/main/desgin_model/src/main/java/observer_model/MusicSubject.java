package observer_model;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题（被观察者的具体实现）
 *
 */
public class MusicSubject implements  Subject{

    private List<Observer> observerList; //观察者列表

    private String message; //需要传达观察者的信息

    public MusicSubject(){
        this.observerList = new ArrayList<Observer>();
        this.message = "";
    }

    public void registerObserver(Observer observer){
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        if (!this.observerList.isEmpty()){
            this.observerList.remove(observer);
        }
    }

    public void notifyObserver(){
        for (Observer observer :this.observerList) {
            observer.update(this.message);
        }
    }

    public void setMessage(String message){
        this.message = message;
    }
}
