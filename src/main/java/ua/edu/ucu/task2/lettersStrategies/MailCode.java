package ua.edu.ucu.task2.lettersStrategies;

import ua.edu.ucu.task2.client.Client;
import ua.edu.ucu.task2.mail.MailFilling;

public interface MailCode {
    MailFilling generate(Client client);
}
