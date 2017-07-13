package StaticFactory;

import AbstractFactory.MailSend;
import AbstractFactory.SmsSend;

/**
 * Created by Administrator on 2017/7/8.
 */
public class main {
    public static  void  main(String[] args){
        SendFactory sendFactory = new SendFactory();
        MailSend mailSend =  sendFactory.produceMail();
        mailSend.Send();
        SmsSend smsSend = sendFactory.produceSms();
        smsSend.Send();
    }
}
