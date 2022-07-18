package Email;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import static Controllers.File_Controller.logger;


public class Email_Sender implements Email{

    public static void sendMail(String receptor, ArrayList list, String habitat) throws MessagingException {
        String correoDeOrigen = "pestanaxd99@gmail.com";
        String correoDeDestino = receptor;
        String asunto = "Lista Animales en habitat " + habitat;
        String mensajeDeTexto = ("Saludos, \n\nEsta es la lista de Animales que solicito del habitat " + habitat + "\n\n" + list);
        String contraseña16Digitos = "aquqzptgscjxyodh";
        try{
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user",correoDeOrigen);
            p.setProperty("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(p);
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(correoDeOrigen));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDeDestino));
            mensaje.setSubject(asunto);
            mensaje.setText(mensajeDeTexto);

            Transport transport = s.getTransport("smtp");
            transport.connect(correoDeOrigen,contraseña16Digitos);
            transport.sendMessage(mensaje, mensaje.getAllRecipients());
            transport.close();
            logger.info("Email sent successfully!");
            System.out.println("Email has been sent! 2");
        }catch ( MessagingException  e){
            System.out.println(e);
        }
    }
}

