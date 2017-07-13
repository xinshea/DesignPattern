package AbstractFactory;

/**
 * Created by Administrator on 2017/7/8.
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSend();
    }
}
