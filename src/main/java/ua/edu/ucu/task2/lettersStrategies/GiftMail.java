package ua.edu.ucu.task2.lettersStrategies;

import ua.edu.ucu.task2.client.Client;

public class GiftMail extends MailCodeClass {
    private static final String SUBJECT_TEMPLATE = "BLACK FRIDAY! %NAME, receive your discount right now!";
    private static final String TEXTPART_TEMPLATE = "%NAME, click HERE to receive a discount!";
    private static final String HTMLPART_TEMPLATE = "<h1> Black FRIDAY is HERE </h1>";

    @Override
    public String generateSubject(Client client) {
        return SUBJECT_TEMPLATE.replaceAll("%NAME", client.getName()).replaceAll("%AGE", Integer.toString(client.getAge()));
    }

    @Override
    public String generateTextPart(Client client) {
        return TEXTPART_TEMPLATE.replaceAll("%NAME", client.getName()).replaceAll("%AGE", Integer.toString(client.getAge()));
    }

    @Override
    public String generateHTML(Client client) {
        return HTMLPART_TEMPLATE.replaceAll("%NAME", client.getName()).replaceAll("%AGE", Integer.toString(client.getAge()));
    }
}
