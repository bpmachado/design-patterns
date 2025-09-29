package br.com.bpmachado.design.patterns.factory.method.presentation;

import br.com.bpmachado.design.patterns.factory.method.domain.Notification;
import br.com.bpmachado.design.patterns.factory.method.factory.NotificationFactory;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationFactory factory;

    @GetMapping("/{type}")
    public ResponseEntity<String> send(@PathVariable String type, @RequestParam String message) {
        Notification notification = factory.getNotification(type);
        notification.sendNotification(message);
        return ResponseEntity.ok("Notificação enviada via " + type);
    }
}
