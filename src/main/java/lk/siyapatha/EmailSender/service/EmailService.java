package lk.siyapatha.EmailSender.service;

import lk.siyapatha.EmailSender.entity.ContactUs;
import lk.siyapatha.EmailSender.entity.Result;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailService {

    public Result SendEmail(ContactUs contact){

        String from="rebornit.lk@gmail.com";
        String password="RebornIT@mit2016";
        String to = "rebornit.lk@gmail.com";
        String sub = " Message from Client - " + contact.getName();
        String msg = "Client Name : " + contact.getName() +"\n" + "Contact Number : " + contact.getPhone() +"\n" +
                "Email : " + contact.getEmail() +"\n"+"Message : " + contact.getMessage() +"\n";


        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            //send message
            Transport.send(message);
            System.out.println("Message Sent Successfully to : " + to );
        } catch (MessagingException e) {
            e.printStackTrace();
            return new Result(e.toString(), 400);
        }
        return new Result("Success", 200);
    }
}
