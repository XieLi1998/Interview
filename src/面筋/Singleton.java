package 面筋;

/**
 * Created by xieli on 2020/10/12.
 */
public class Singleton {

    private volatile static Singleton uniqueSingleton;

    private Singleton() {
    }

    public static Singleton getUniqueSingleton() {
        if (uniqueSingleton == null) {
            synchronized (Singleton.class) {
                if (uniqueSingleton == null) {
                    uniqueSingleton = new Singleton();
                }
            }
        }
        return uniqueSingleton;
    }

}
