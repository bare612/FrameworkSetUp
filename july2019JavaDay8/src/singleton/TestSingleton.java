package singleton;


public class TestSingleton {
    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        System.out.println(singleton.password);
    }
}

