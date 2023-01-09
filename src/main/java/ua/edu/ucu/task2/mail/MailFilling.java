package ua.edu.ucu.task2.mail;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MailFilling {
    private String SUBJECT;
    private String TEXTPART;
    private String HTMLPART;

    public MailFilling(String SUBJECT, String TEXTPART, String HTMLPART) {
        this.SUBJECT = SUBJECT;
        this.TEXTPART = TEXTPART;
        this.HTMLPART = HTMLPART;
    }
}
