package ua.edu.ucu.task2.mail;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.task2.client.Client;
import ua.edu.ucu.task2.client.Sex;
import ua.edu.ucu.task2.lettersStrategies.BirthdayMail;
import ua.edu.ucu.task2.lettersStrategies.GiftMail;

public class MailInfoTest {
    @Test
    public void giftMailInfoTextTest(){
        Client client = new Client("Oles", Sex.MALE, 31, "Oles.Dobosevych@mail.com");
        MailInfo mailInfo = new MailInfo(client, new GiftMail());

        MailFilling mailFilling = mailInfo.generate();
        Assertions.assertEquals("BLACK FRIDAY! Oles, receive your discount right now!", mailFilling.getSUBJECT());
        Assertions.assertEquals("Oles, click HERE to receive a discount!", mailFilling.getTEXTPART());
        Assertions.assertEquals("<h1> Black FRIDAY is HERE </h1>", mailFilling.getHTMLPART());
    }
    @Test
    public void birthdayMailInfoTextTest(){
        Client client = new Client("Oles", Sex.MALE, 31, "Oles.Dobosevych@mail.com");
        MailInfo mailInfo = new MailInfo(client, new BirthdayMail());

        MailFilling mailFilling = mailInfo.generate();
        Assertions.assertEquals("Happy birthday!", mailFilling.getSUBJECT());
        Assertions.assertEquals("Oles, happy 31th birthday!", mailFilling.getTEXTPART());
        Assertions.assertEquals("<h1> Oles, happy 31th birthday! </h1> <p> Use THIS promo code to get a gift from us!</p>", mailFilling.getHTMLPART());
    }
}
