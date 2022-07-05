package Email;
/*
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Email_Sender {

    public static void sendMail(String receptor) throws MessagingException {

        System.out.println("Preparing to sent email");

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);

        String myAccount = "********@gmail.com";
        String password = "********";

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount, password);
            }
        });

        Message message = prepareMessage(session, myAccount, receptor);
        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String myAccount, String receptor) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
            message.setSubject("Zoo");
            message.setText("List");
        } catch (Exception ex) {
            Logger.getLogger(EmailSender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
*/