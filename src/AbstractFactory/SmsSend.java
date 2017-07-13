package AbstractFactory;

/**
 * Created by Administrator on 2017/7/8.
 */
public class SmsSend implements Sender{
    @Override
    public void Send() {
        System.out.println("SmsSend");
    }
}
