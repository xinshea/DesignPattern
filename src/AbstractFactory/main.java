package AbstractFactory;

/**
 * Created by Administrator on 2017/7/8.
 */
public class main {
    public static  void  main(String[] args){
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
        Provider provider1 = new SendSmsFactory();
        Sender sender1 = provider1.produce();
        sender1.Send();
    }
}
