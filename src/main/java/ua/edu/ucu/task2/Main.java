package ua.edu.ucu.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import ua.edu.ucu.task2.client.Client;
import ua.edu.ucu.task2.client.Sex;
import ua.edu.ucu.task2.lettersStrategies.BirthdayMail;
import ua.edu.ucu.task2.lettersStrategies.GiftMail;
import ua.edu.ucu.task2.mail.MailInfo;
import ua.edu.ucu.task2.managers.MailBox;
import ua.edu.ucu.task2.managers.MailSender;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        BirthdayMail mailCode1 = new BirthdayMail();
        GiftMail mailCode2 = new GiftMail();

        Client sender = new Client("Oles", Sex.MALE, 31, "sender_mail");
        Client receiver = new Client("Oles", Sex.MALE, 31, "receiver_mail");

        MailInfo mail1 = new MailInfo(receiver, mailCode1);
        MailInfo mail2 = new MailInfo(receiver, mailCode2);

        MailSender mailSender = new MailSender("API_KEY", "SECRET_KEY", sender);

        MailBox box = new MailBox(new ArrayList<>(), mailSender);
        box.addMailInfo(mail1);
        box.addMailInfo(mail2);

        box.sendAll();
    }
}