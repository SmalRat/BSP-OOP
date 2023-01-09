package ua.edu.ucu.task2.managers;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.task2.mail.MailInfo;

import java.util.List;

public class MailBox {
    @Getter @Setter
    private MailSender mailSender;
    @Getter @Setter
    private List<MailInfo> mails;

    public MailBox(List<MailInfo> mails, MailSender mailSender){
        this.mails = mails;
        this.mailSender = mailSender;
    }
    public void addMailInfo(MailInfo mailInfo){
        this.mails.add(mailInfo);
    }
    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo mailInfo: mails){
            mailSender.sendMail(mailInfo);
        }
    }
}
