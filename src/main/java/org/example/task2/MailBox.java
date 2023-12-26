package org.example.task2;

import com.mailjet.client.errors.MailjetException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    public MailBox() {
        this.infos = new ArrayList<>();
    }
    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll(String apiKey, String apiSecretKey) throws MailjetException {
        for (MailInfo info : infos) {
            MailSender.sendMail(info, apiKey, apiSecretKey);
        }
    }
}
