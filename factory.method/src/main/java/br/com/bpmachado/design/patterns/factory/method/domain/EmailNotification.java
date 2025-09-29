package br.com.bpmachado.design.patterns.factory.method.domain;


import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
