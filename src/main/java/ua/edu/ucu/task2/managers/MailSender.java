package ua.edu.ucu.task2.managers;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
import ua.edu.ucu.task2.client.Client;
import ua.edu.ucu.task2.mail.MailFilling;
import ua.edu.ucu.task2.mail.MailInfo;

public class MailSender {
    private final String API_KEY;
    private final String SECRET_KEY;

    private final Client sender;

    public MailSender(String API_KEY, String SECRET_KEY, Client sender){
        this.API_KEY = API_KEY;
        this.SECRET_KEY = SECRET_KEY;
        this.sender = sender;
    }
    public void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        MailFilling mail = mailInfo.generate();
        client = new MailjetClient(API_KEY, SECRET_KEY, new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", sender.getMail())
                                        .put("Name", sender.getName()))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getMail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, mail.getSUBJECT())
                                .put(Emailv31.Message.TEXTPART, mail.getTEXTPART())
                                .put(Emailv31.Message.HTMLPART, mail.getHTMLPART())
                                .put(Emailv31.Message.CUSTOMID, "Test")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
