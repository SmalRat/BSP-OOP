package ua.edu.ucu.task2.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.task2.client.Client;
import ua.edu.ucu.task2.lettersStrategies.MailCode;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailCode;

    public MailFilling generate() {
        return mailCode.generate(client);
    }
}
