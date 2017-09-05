package sort;

/**
 * Created by lenovo on 2017/8/28.
 */
public class Singleton {
    private Singleton(){
        System.out.println("singleton is created");
    }
    private static Singleton singleton = null;
    public  static synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
