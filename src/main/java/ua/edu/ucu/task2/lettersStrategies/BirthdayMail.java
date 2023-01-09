package ua.edu.ucu.task2.lettersStrategies;

import ua.edu.ucu.task2.client.Client;

public class BirthdayMail extends MailCodeClass {
    private static final String SUBJECT_TEMPLATE = "Happy birthday!";
    private static final String TEXTPART_TEMPLATE = "%NAME, happy %AGEth birthday!";
    private static final String HTMLPART_TEMPLATE = "<h1> %NAME, happy %AGEth birthday! </h1> <p> Use THIS promo code to get a gift from us!</p>";

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
