package br.com.bpmachado.design.patterns.factory.method.domain;


import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
