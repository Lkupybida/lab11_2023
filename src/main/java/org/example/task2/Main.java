package org.example.task2;

import com.mailjet.client.errors.MailjetException;

public class Main {
    public static void main(String[] args) throws MailjetException {
        Client client = new Client("Joe Doe", 69, "Male");
        String apiKey = "blablabla";
        String apiSecretKey = "blablabla";
        MailInfo spamMail = new MailInfo(client, MailCode.WILL);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(spamMail);
        mailBox.sendAll(apiKey, apiSecretKey);
    }
}