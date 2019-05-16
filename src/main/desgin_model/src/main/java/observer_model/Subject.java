package observer_model;

/**
 * 主题（被观察的对象）
 *
 * 提供观察者的注册方法、注销方法和通知观察者方法
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
