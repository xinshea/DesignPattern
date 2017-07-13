package AbstractFactory;

/**
 * Created by Administrator on 2017/7/8.
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSend();
    }
}
