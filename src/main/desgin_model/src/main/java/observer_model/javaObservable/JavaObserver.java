package observer_model.javaObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者，需要实现java.util的 Observer接口，实现更新的方法。
 *
 */
public class JavaObserver implements Observer {

    public void update(Observable o, Object arg){
        System.out.println(arg);
    }
}
