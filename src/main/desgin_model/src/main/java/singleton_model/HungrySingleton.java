package singleton_model;

/**
 * 饿汉式 单例模式
 *
 * 线程安全
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }

}
