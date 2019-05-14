package singleton_model;

/**
 * 懒汉式 单例模式
 *
 * 线程不安全,因为多个线程可能同时调用getLazySingleton方法，这个会造成创建多个不同的对象。
 */
public class LazySingleton {

    private static LazySingleton lazySignleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton(){
        if (lazySignleton == null){
            lazySignleton = new LazySingleton();
        }
        return lazySignleton;
    }

}
