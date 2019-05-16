package observer_model.javaObservable;

import java.util.Observable;

/**
 * java 的util自带了观察者模式，被观察者需要继承Observable，Observable内置了很多方法可以直接调用。
 *
 * 相比于自己去实现观察者模式，采用java内置的更加的方便，不用自己去实现主题和观察者。
 */
public class JavaSubject extends Observable {

    public static void main(String[] args){

        JavaSubject subject = new JavaSubject();

        JavaObserver javaObserver = new JavaObserver();
        subject.addObserver(javaObserver);
        subject.setChanged(); //当改变状态才能通知成功
        subject.notifyObservers("123ASD");
    }
}
