package Singleton;

/**
 * Created by Administrator on 2017/7/8.
 */
public class Singleton {

    volatile  private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){

//        try {
            if(instance ==null){
//                Thread.sleep(300);
                synchronized (Singleton.class){
                    if(instance ==null) {
                        instance = new Singleton();
                    }
                }
            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        return instance;
    }


    public void say(){
        System.out.println("hello");
    }
}
