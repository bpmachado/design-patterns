package br.com.bpmachado.design.patterns.factory.method.domain;

import org.springframework.stereotype.Component;

@Component("WhatsApp")
public class WhatsAppNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando mensagem via WhatsApp: " + message);
    }
}
