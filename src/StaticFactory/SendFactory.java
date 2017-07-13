package StaticFactory;

import AbstractFactory.MailSend;
import AbstractFactory.SmsSend;

/**
 * Created by Administrator on 2017/7/8.
 */
public class SendFactory {
    public static MailSend produceMail(){
        return new MailSend();
    }

    public static SmsSend produceSms(){
        return new SmsSend();
    }
}
