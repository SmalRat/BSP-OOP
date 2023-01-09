package ua.edu.ucu.task2.lettersStrategies;

import ua.edu.ucu.task2.client.Client;
import ua.edu.ucu.task2.mail.MailFilling;

public abstract class MailCodeClass implements MailCode{
    public abstract String generateSubject(Client client);
    public abstract String generateTextPart(Client client);
    public abstract String generateHTML(Client client);
    @Override
    public MailFilling generate(Client client){
        String subject = generateSubject(client);
        String textPart = generateTextPart(client);
        String HTMLPart = generateHTML(client);

        return new MailFilling(subject, textPart, HTMLPart);
    }
}
