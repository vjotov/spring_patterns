package singleton;

public class LazySingleton {
    private static volatile LazySingleton singleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(singleton == null){
            synchronized (LazySingleton.class) {
                if(singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
