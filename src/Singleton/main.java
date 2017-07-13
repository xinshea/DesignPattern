package Singleton;

/**
 * Created by Administrator on 2017/7/8.
 */
public class main extends Thread{
    @Override
    public void run(){
        System.out.println(Singleton.getInstance().hashCode());
    }
    public static  void  main(String[] args){
        main[] mts = new main[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new main();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }
}
