package org.example.task2;

import com.mailjet.client.*;
import com.mailjet.client.errors.*;
import com.mailjet.client.resource.*;
import org.json.*;

public class MailSender {

    public static void sendMail(MailInfo mailInfo, String apiKey, String apiSecretKey) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;

        ClientOptions options = ClientOptions.builder().apiKey(apiKey).apiSecretKey(apiSecretKey).build();
        client = new MailjetClient(options);

        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", mailInfo.getClient().getEmail())
                                        .put("Name", mailInfo.getClient().getName())) // Fixing the placeholder here
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getEmail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.CUSTOMID, mailInfo.getClient().getId())));

        response = client.post(request);

        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
