package Email;

import Interfaces.Email;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Email_Sender implements Email {
  public static void sendMail(String receptor) throws MessagingException {
    String correoDeOrigen = "pestanaxd99@gmail.com";
    String correoDeDestino = "pestanaxd99@gmail.com";
    String asunto = "Animales";
    String mensajeDeTexto = "Estamos enviando las cosas que necesitamos :D";
    String contraseña16Digitos = "aquqzptgscjxyodh";
    try {
      Properties p = new Properties();
      p.put("mail.smtp.host", "smtp.gmail.com");
      p.setProperty("mail.smtp.starttls.enable", "true");
      p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
      p.setProperty("mail.smtp.port", "587");
      p.setProperty("mail.smtp.user", correoDeOrigen);
      p.setProperty("mail.smtp.auth", "true");

      Session s = Session.getDefaultInstance(p);
      MimeMessage mensaje = new MimeMessage(s);
      mensaje.setFrom(new InternetAddress(correoDeOrigen));
      mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDeDestino));
      mensaje.setSubject(asunto);
      mensaje.setText(mensajeDeTexto);

      Transport transport = s.getTransport("smtp");
      transport.connect(correoDeOrigen, contraseña16Digitos);
      transport.sendMessage(mensaje, mensaje.getAllRecipients());
      transport.close();
      JOptionPane.showMessageDialog(null, "Email has been sent! 1");
      System.out.println("Email has been sent! 2");
    } catch (MessagingException e) {
      System.out.println(e);
    }
  }
}
