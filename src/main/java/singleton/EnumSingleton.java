package singleton;

public enum EnumSingleton {
    INSTANCE;

    /**
     *  use the following way: EnumSingleton.INSTANCE.doWork()
     */
    public void doWork() {
        System.out.println("some text");
    }
}
