package br.com.bpmachado.design.patterns.factory.method.factory;

import br.com.bpmachado.design.patterns.factory.method.domain.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.Map;

@Component
@RequiredArgsConstructor
public class NotificationFactory {

    private final Map<String, Notification> notificationMap;

    public Notification getNotification(String type) {
        Notification notification = notificationMap.get(type);

        if (notification == null) {
            throw new IllegalArgumentException("Tipo de notificação desconhecido: " + type);
        }

        return notification;
    }


}
